package com.mapping.onetoone.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.onetoone.Entity.Passport;
import com.mapping.onetoone.Entity.Person;
import com.mapping.onetoone.Repository.PassportRepository;
import com.mapping.onetoone.Repository.PersonRepository;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    @Autowired 
    private PassportRepository passportRepository;

    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }

    public Optional<Person> getPersonById(Long id){
        return personRepository.findById(id);
    }    

    public Person savePerson(Person person){
    return personRepository.save(person);
    }

    public Person savePersonExistingPassport(Person person){
        Person person2 = new Person();
        person2.setName(person.getName());
        person2.setPassport(passportRepository.findById(person.getPassport().getId()).get());
        return personRepository.save(person2);
    }

    // public Person savePersonExisting(Person person1){
    //     Person person=new Person();
    //     person.setName(person1.getName());
    //     person.setPassport(person1.getPassport());
    //     Passport p=new Passport();
    //     p.setId(p.getId());
    //     person.setPassport(p);
    //     return personRepository.save(person);
    // }

    public void deleteById(Long id){
        personRepository.deleteById(id);
    }

}
