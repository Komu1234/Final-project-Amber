package com.example.redbank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.redbank.Entity.Registeration;

@Repository
public interface RegisterationRepository extends JpaRepository<Registeration, Integer> {
    
}
