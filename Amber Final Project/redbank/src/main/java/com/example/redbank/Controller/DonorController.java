package com.example.redbank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.redbank.Entity.DonorEntity;
import com.example.redbank.Service.DonorService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/donor")
public class DonorController {

    @Autowired
    private DonorService ds;

    @GetMapping("/get")
    public ResponseEntity<List<DonorEntity>> gettingAllDonorFromDatabase(){
        return ResponseEntity.ok(ds.gettingAllDonor());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DonorEntity> gettingDonorByIDFromDatabase(@PathVariable int id){
        return ResponseEntity.ok(ds.gettingDonorById(id));
    }

    @PostMapping("/add")
    public ResponseEntity<DonorEntity> addingNewDonorToDatabase(@RequestBody DonorEntity donorentity){
        return ResponseEntity.ok(ds.addingNewDonor(donorentity));
    }

    @PutMapping("/update")
    public ResponseEntity<DonorEntity> updatingDonorFromDatabase(@RequestParam int id, @RequestBody DonorEntity donorentity){
        return ResponseEntity.ok(ds.updatingDonorEntity(id, donorentity));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deletingDonorFromDatabase(@RequestParam int id){
        return ResponseEntity.ok(ds.deletingDonorById(id));
    }
    
}
