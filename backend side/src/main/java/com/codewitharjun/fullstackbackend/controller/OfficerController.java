package com.codewitharjun.fullstackbackend.controller;

import com.codewitharjun.fullstackbackend.Service.AppService;
//import com.codewitharjun.fullstackbackend.Service.DirService;
import com.codewitharjun.fullstackbackend.exception.OfficerNotFoundException;
import com.codewitharjun.fullstackbackend.model.DloginRequest;

import com.codewitharjun.fullstackbackend.model.Drive;
import com.codewitharjun.fullstackbackend.model.LoginRequest;
import com.codewitharjun.fullstackbackend.model.Officer;
import com.codewitharjun.fullstackbackend.repository.OfficerRepository;
import com.codewitharjun.fullstackbackend.model.Drive;
import com.codewitharjun.fullstackbackend.repository.DriveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin("http://localhost:3000")

public class OfficerController {
    public String searchname="";


    @Autowired
    private OfficerRepository officerRepository;



    @PostMapping("/officer")
    Officer newofficer(@RequestBody Officer newOfficer){

        return officerRepository.save(newOfficer);

    }

    @GetMapping("/officer1")
    List<Officer> getAllOfficer1(){

        return officerRepository.findAll();
    }

    @GetMapping("/officer")
    List<Officer> getAllOfficer(){

             return officerRepository.findByName(searchname);
    }


    @GetMapping("/officer/{id}")
    Officer getOfficerById(@PathVariable Long id) {
        return officerRepository.findById(id)
                .orElseThrow(() -> new OfficerNotFoundException(id));
    }

    @PutMapping("/officer/{id}")
    Officer updateOfficer(@RequestBody Officer newOfiicer, @PathVariable Long id){
        return officerRepository.findById(id)
                .map(officer -> {
                    officer.setRollno(newOfiicer.getRollno());
                    officer.setName(newOfiicer.getName());
                    officer.setDate(newOfiicer.getDate());
                    officer.setComp_name(newOfiicer.getComp_name());
                    officer.setHR_name(newOfiicer.getHR_name());
                    officer.setHR_email(newOfiicer.getHR_email());
                    officer.setHR_phoneno(newOfiicer.getHR_phoneno());
                    officer.setReport(newOfiicer.getReport());
                    return officerRepository.save(officer);
               } ).orElseThrow(()->new OfficerNotFoundException(id));
    }

    @DeleteMapping("/officer/{id}")
    String deleteOfficer(@PathVariable Long id){
        if(!officerRepository.existsById(id)){
            throw new OfficerNotFoundException(id);
        }
        officerRepository.deleteById(id);
        return "Officer with id "+id+" has been deleted successfully";
    }
    @Autowired
    private   AppService appService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        System.out.println(loginRequest.username+" "+loginRequest.password);
        boolean isAuthenticated = appService.authenticate(loginRequest.username, loginRequest.password);
        if (isAuthenticated) {
            searchname=loginRequest.username;
            return ResponseEntity.ok(loginRequest.password);
        } else {
            return ResponseEntity.ok("");
        }
    }


    @PostMapping("/login2")
    public ResponseEntity<Boolean> login(@RequestBody DloginRequest DloginRequest) {
        System.out.println(DloginRequest.username+" "+DloginRequest.password);
        boolean isAuthenticated = (((DloginRequest.username).equals("Admin")) && ((DloginRequest.password).equals("12345")))?true:false;
        if (isAuthenticated) {
            return ResponseEntity.ok(true);
        } else {
            return ResponseEntity.ok(false);
        }
    }





}
