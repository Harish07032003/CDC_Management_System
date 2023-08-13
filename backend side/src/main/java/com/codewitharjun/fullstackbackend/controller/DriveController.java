package com.codewitharjun.fullstackbackend.controller;

import com.codewitharjun.fullstackbackend.model.Drive;
import com.codewitharjun.fullstackbackend.model.Officer;
import com.codewitharjun.fullstackbackend.model.User;
import com.codewitharjun.fullstackbackend.repository.DriveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class DriveController {
//    OfficerController off_control=new OfficerController();
    @Autowired

    private DriveRepository driveRepository;

    @PostMapping("/drive")
    Drive newdrive(@RequestBody Drive newDrive){

        return driveRepository.save(newDrive);

    }
    @GetMapping("/drive1")
    List<Drive> getAllDrives(){
        return driveRepository.findAll();

    }
}
