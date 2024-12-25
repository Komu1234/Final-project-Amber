package com.example.redbank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.redbank.Entity.RecieverEntity;

@Repository
public interface RecieverRepository extends JpaRepository<RecieverEntity, Integer> {

    
} 
