package com.mapping1.manytoone.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long aId;
    private String street;
    private String area;
    private String pincode;

    @ManyToOne
    private Employee employee;
   // @JoinColumn(name="EmployeeId",referencedColumnName = "eId")

    public Address() {
    }

    public Address(String street, String area, String pincode, Employee employee) {
        this.street = street;
        this.area = area;
        this.pincode = pincode;
        this.employee = employee;
    }

    public Long getaId() {
        return aId;
    }

    public void setaId(Long aId) {
        this.aId = aId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    
    
}
