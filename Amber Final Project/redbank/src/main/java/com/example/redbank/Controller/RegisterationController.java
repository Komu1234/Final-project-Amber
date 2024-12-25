package com.example.redbank.Controller;

import com.example.redbank.Entity.RecieverEntity;
import com.example.redbank.Entity.Registeration;
import com.example.redbank.Service.RegisterationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/redbank/registeration")
public class RegisterationController {

    @Autowired
    private RegisterationService regss;

    @PostMapping("/add")
    public ResponseEntity<Registeration> addingNewRegisterationToDatabase(@RequestBody Registeration registeration){
        return ResponseEntity.ok(regss.addingNewRegisteration(registeration));
    }

    @PutMapping("/update")
    public ResponseEntity<Registeration> updatingRegisterationFromDatabase(@RequestParam int id, @RequestBody Registeration registeration){
        return ResponseEntity.ok(regss.updatingRegisteredUser(id, registeration));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deletingRegisterationFromDatabase(@RequestParam int id){
        return ResponseEntity.ok(regss.deletingRegisteredUserById(id));
    }
}
