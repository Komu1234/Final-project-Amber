package com.example.redbank.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.redbank.Entity.BloodGroupEntity;
import com.example.redbank.Repository.BloodGroupRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BloodGroupService {

    @Autowired
    private BloodGroupRepository bgr;

    public List<BloodGroupEntity> gettingAllBloodGroup(){
        return bgr.findAll();
    }

    // public BloodGroupEntity gettingBloodGroupById(int id){
    //     return bgr.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "This ID is not found in the database : "+id));
    // }

    // public BloodGroupEntity addingNewBloodGroupEntity(BloodGroupEntity bloodgroup){
    //     return bgr.save(bloodgroup);
    // }

    // public BloodGroupEntity updatingBloodGroupEntity(int id, BloodGroupEntity bloodgroup){
    //     BloodGroupEntity exisitngBloodGroup = bgr.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "This id is not found in the database so try to add new :"+id));
    //     if(exisitngBloodGroup != null ){
    //         BloodGroupEntity upBloodGroupEntity = exisitngBloodGroup.get();
    //         bloodgroup.setBloodgroupId(exisitngBloodGroup.getBloodgroupId(id));
    //         return bgr.save(bloodgroup);
    //     }
        
    // }
    
    // public String deletingBloodGroupById(int id){
    //     bgr.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "This ID is not present in the database :"+ id));
    //     bgr.deleteById(id);
    //     return "Deleted BloodGroup Successfully";
    // }
}
