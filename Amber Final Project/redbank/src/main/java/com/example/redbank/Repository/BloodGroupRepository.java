package com.example.redbank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.redbank.Entity.BloodGroupEntity;

@Repository
public interface BloodGroupRepository extends JpaRepository<BloodGroupEntity, Integer>{
    
}
