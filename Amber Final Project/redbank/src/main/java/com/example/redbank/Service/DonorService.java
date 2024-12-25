package com.example.redbank.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.redbank.Entity.BloodGroupEntity;
import com.example.redbank.Entity.DonorEntity;
import com.example.redbank.Repository.DonorRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class DonorService {

    @Autowired
    private DonorRepository dr;

    public List<DonorEntity> gettingAllDonor(){
        return dr.findAll();
    }

    public DonorEntity gettingDonorById(int id){
        return dr.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "This ID is not found in the database : "+id));
    }

    public DonorEntity addingNewDonor(DonorEntity donorentity){
        return dr.save(donorentity);
    }

    public DonorEntity updatingDonorEntity(int id, DonorEntity donorentity){
        DonorEntity exisitngDonor = dr.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "This id is not found in the database so try to add new :"+id));
        donorentity.setDonorId(exisitngDonor.getDonorId());    
        return dr.save(donorentity);
    }   

    public String deletingDonorById(int id){
        dr.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "This ID is not present in the database :"+ id));
        dr.deleteById(id);
        return "Deleted BloodGroup Successfully";
    }
}
