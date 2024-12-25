package com.example.redbank.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


import com.example.redbank.Entity.RecieverEntity;
import com.example.redbank.Repository.RecieverRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class RecieverService {

    @Autowired
    private RecieverRepository rr;

    public List<RecieverEntity> gettingAllReciever(){
        return rr.findAll();
    }

    public RecieverEntity gettingRecieverById(int id){
        return rr.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "This ID is not found in the database : "+id));
    }

    public RecieverEntity addingNewReciever(RecieverEntity recieverentity){
        return rr.save(recieverentity);
    }

    public RecieverEntity updatingRecieverEntity(int id, RecieverEntity recieverentity){
        RecieverEntity exisitngReciever = rr.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "This id is not found in the database so try to add new :"+id));
        recieverentity.setRecieverId(exisitngReciever.getRecieverId());
            return rr.save(recieverentity);
    }    
    
    public String deletingRecieverById(int id){
        rr.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "This ID is not present in the database :"+ id));
        rr.deleteById(id);
        return "Deleted BloodGroup Successfully";
    }
}
