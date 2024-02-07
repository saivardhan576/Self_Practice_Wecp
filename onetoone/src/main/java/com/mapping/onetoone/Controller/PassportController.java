package com.mapping.onetoone.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.onetoone.Entity.Passport;
import com.mapping.onetoone.Service.PassportService;

@RestController
public class PassportController {

    @Autowired
    private PassportService passportService;

    @GetMapping("/passport")
    public List<Passport> getAllPassports(){
        return passportService.getAllPassports();
    }
    
    @GetMapping("/passport/{id}")
    public Optional<Passport> getPassportById(@PathVariable Long id){
        return passportService.getPassportById(id);
    }

    @PostMapping("/passport")
    public Passport savePassport(@RequestBody Passport passport){
        return passportService.savePassport(passport);
    }

    @DeleteMapping("/passport/{id}")
    public void deletePassportById(@PathVariable Long id){
        passportService.deletePassportById(id);
    }
    
}
