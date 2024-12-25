package com.example.redbank.Service;

import com.example.redbank.Entity.DonorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import com.example.redbank.Repository.RegisterationRepository;
import com.example.redbank.Entity.Registeration;
import org.springframework.web.server.ResponseStatusException;

@Service
@Transactional
public class RegisterationService {
    
    @Autowired
    private RegisterationRepository regsr;

    public Registeration addingNewRegisteration(Registeration registeration){
        return regsr.save(registeration);
    }

    public Registeration updatingRegisteredUser(int id, Registeration registeration){
        Registeration exisitngUser = regsr.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "This id is not found in the database so try to add new :"+id));
        registeration.setUserId(exisitngUser.getUserId());
        return regsr.save(registeration);
    }

    public String deletingRegisteredUserById(int id){
        regsr.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "This ID is not present in the database :"+ id));
        regsr.deleteById(id);
        return "Deleted BloodGroup Successfully";
    }
}
