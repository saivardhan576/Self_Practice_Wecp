package com.mapping1.manytoone.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mapping1.manytoone.Entity.Address;
import com.mapping1.manytoone.Service.AddressService;

@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/address")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @GetMapping("/address/{aId}")
    public Optional<Address> getAddressById(@PathVariable Long aId){
        return addressService.getAddressById(aId);
    }
    @GetMapping("/employees/{employeeId}/address")
    public List<Address> findAllAddressForEmployees(Long employeeId){
        return addressService.findAllAddressForEmployee(employeeId);
    }

    @PostMapping("/address")
    public Address saveAddress(@RequestBody Address address){
        return addressService.saveAddress(address);
    }
    @PostMapping("/address/exist")
    public Address saveAddressWithExistEmp(@RequestBody Address address){
        return addressService.createAddressWithExistingEmployee(address);
    }

    @DeleteMapping("/address/{aId}")
    public void deleteAddressById(@PathVariable Long aId){
        addressService.deleteAddressById(aId);
    }

    
}
