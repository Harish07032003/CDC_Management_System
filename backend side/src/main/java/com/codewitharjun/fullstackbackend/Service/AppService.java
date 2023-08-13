package com.codewitharjun.fullstackbackend.Service;
import com.codewitharjun.fullstackbackend.model.Officer;
import com.codewitharjun.fullstackbackend.model.User;
import com.codewitharjun.fullstackbackend.repository.UserRepository;
import com.codewitharjun.fullstackbackend.repository.OfficerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppService {

    @Autowired
    private UserRepository userRepository;
    public Boolean authenticate(String name, String rollno){
        System.out.println(name+" "+rollno);
        Optional<User> userOptional = userRepository.findByRollnoAndName(name, rollno);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return true;
        }

        return false;
    }
}
