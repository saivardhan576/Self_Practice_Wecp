package com.mapping1.manytoone.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long eId;
    private String eName;
    private String email;

    @OneToMany(mappedBy="employee",cascade=CascadeType.ALL,orphanRemoval = true)
    @JsonIgnore
    private List<Address> address;

    public Employee() {
    }
   
    public Employee(String eName, String email, List<Address> address) {
        this.eName = eName;
        this.email = email;
        this.address = address;
    }

    public Long geteId() {
        return eId;
    }
    public void seteId(Long eId) {
        this.eId = eId;
    }


    public String geteName() {
        return eName;
    }
    public void seteName(String eName) {
        this.eName = eName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
   
    
}
