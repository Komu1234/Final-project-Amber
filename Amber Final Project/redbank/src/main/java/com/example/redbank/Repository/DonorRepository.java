package com.example.redbank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.redbank.Entity.DonorEntity;

@Repository
public interface DonorRepository extends JpaRepository<DonorEntity,Integer> {

} 
    

