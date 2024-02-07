package com.mapping.onetoone.Entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String passportNumber;
    private LocalDate issueDate;
    private String country;

    //@OneToOne(cascade=CascadeType.ALL)
    //@JoinColumn(name="PersonId",referencedColumnName="id")
    private Person person;
   
    public Passport() {
    }

    public Passport(String passportNumber, LocalDate issueDate, String country, Person person) {
        this.passportNumber = passportNumber;
        this.issueDate = issueDate;
        this.country = country;
        this.person=person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

   

    
    
    

