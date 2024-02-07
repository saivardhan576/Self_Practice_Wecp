package com.sai.user.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.sai.user.Entity.User;
import com.sai.user.Exception.UserNotFoundException;
import com.sai.user.service.UserService;

@RestController
public class UserController {
    @Autowired
    private final UserService service;
    

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> retriveAllUsers(){
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retriveUser(@PathVariable int id){
        return service.findone(id);
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User savedUser=service.save(user);
        //URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
        //return ResponseEntity.created(location).build();
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
        
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) throws  UserNotFoundException{
        User user=service.deleteById(id);
        if(user==null){
            throw new UserNotFoundException("Id is"+id);
        }
    }

    
}
