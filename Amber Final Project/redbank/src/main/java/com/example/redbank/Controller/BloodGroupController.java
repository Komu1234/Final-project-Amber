package com.example.redbank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.redbank.Entity.BloodGroupEntity;
import com.example.redbank.Service.BloodGroupService;

@RestController
@RequestMapping("/redbank")
public class BloodGroupController {

    @Autowired
    private BloodGroupService bgs;

    @GetMapping
    public ResponseEntity<List<BloodGroupEntity>> gettingAllBloodGroupFromDatabase()
    {
        return ResponseEntity.ok(bgs.gettingAllBloodGroup());
    }
    
}
