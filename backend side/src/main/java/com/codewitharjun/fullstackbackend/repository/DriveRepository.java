package com.codewitharjun.fullstackbackend.repository;

import com.codewitharjun.fullstackbackend.model.Drive;
import com.codewitharjun.fullstackbackend.model.Officer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DriveRepository extends JpaRepository<Drive, Long> {
}
