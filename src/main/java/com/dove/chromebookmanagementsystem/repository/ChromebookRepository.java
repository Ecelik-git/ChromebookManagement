package com.dove.chromebookmanagementsystem.repository;

import com.dove.chromebookmanagementsystem.model.Chromebook;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChromebookRepository extends JpaRepository<Chromebook, String> {
    
}
