package com.example.redbank.Controller;

import java.util.List;

import com.example.redbank.Entity.DonorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.redbank.Entity.RecieverEntity;
import com.example.redbank.Service.RecieverService;

@RestController
@RequestMapping("/redbank/reciever")
public class RecieverController {
    
    @Autowired
    private RecieverService rs;

    @GetMapping
    public ResponseEntity<List<RecieverEntity>> gettingAllRecieverFromDatabase(){
        return ResponseEntity.ok(rs.gettingAllReciever());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecieverEntity> gettingRecieverByIDFromDatabase(@PathVariable int id){
        return ResponseEntity.ok(rs.gettingRecieverById(id));
    }

    @PostMapping("/add")
    public ResponseEntity<RecieverEntity> addingNewRecieverToDatabase(@RequestBody RecieverEntity recieverentity){
        return ResponseEntity.ok(rs.addingNewReciever(recieverentity));
    }

    @PutMapping("/update")
    public ResponseEntity<RecieverEntity> updatingRecieverFromDatabase(@RequestParam int id, @RequestBody RecieverEntity recieverentity){
        return ResponseEntity.ok(rs.updatingRecieverEntity(id, recieverentity));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deletingRecieverFromDatabase(@RequestParam int id){
        return ResponseEntity.ok(rs.deletingRecieverById(id));
    }
}
