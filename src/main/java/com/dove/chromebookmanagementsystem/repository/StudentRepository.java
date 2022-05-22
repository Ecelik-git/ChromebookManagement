package com.dove.chromebookmanagementsystem.repository;

import com.dove.chromebookmanagementsystem.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
