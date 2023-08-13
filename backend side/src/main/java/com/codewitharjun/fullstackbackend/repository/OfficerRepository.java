package com.codewitharjun.fullstackbackend.repository;

import com.codewitharjun.fullstackbackend.model.Officer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OfficerRepository extends JpaRepository<Officer , Long> {

    List<Officer> findByName(String name);

}
