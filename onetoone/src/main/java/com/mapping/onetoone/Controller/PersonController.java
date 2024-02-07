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

import com.mapping.onetoone.Entity.Person;
import com.mapping.onetoone.Service.PersonService;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }
    @GetMapping("/persons/{id}")
    public Optional<Person> getPersonById(@PathVariable Long id){
        return personService.getPersonById(id);
    }

    @PostMapping("/persons")
    public Person savePerson(@RequestBody Person person){
        return personService.savePerson(person);
    }

        // @PostMapping("/persons/1")
        // public Person savePersonExisting(Person person1){
        //     return personService.savePersonExisting(person1);
        // }

    @DeleteMapping("/persns/{id}")
    public void deleteById(@PathVariable Long id){
        personService.deleteById(id);
    }
    
}
