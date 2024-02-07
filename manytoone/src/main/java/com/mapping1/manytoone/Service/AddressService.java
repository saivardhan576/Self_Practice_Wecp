package com.mapping1.manytoone.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping1.manytoone.Entity.Address;
import com.mapping1.manytoone.Repository.AddressRepository;
import com.mapping1.manytoone.Repository.EmployeeRepository;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Address> getAllAddress(){
        return addressRepository.findAll();
    }

    public Optional<Address> getAddressById(Long aId){
        return addressRepository.findById(aId);
    }    

    public List<Address> findAllAddressForEmployee(Long employeeId){
        List<Address> a=addressRepository.findAllAddressForEmployee(employeeId);
        return a;
    }

    public Address saveAddress(Address address){
        // Address address1=new Address();
        // address1.setStreet(address.getStreet());
        // address1.setArea(address.getArea());
        // address1.setPincode(address.getPincode());
        // address1.setEmployee(employeeRepository.findById(address.getEmployee().geteId()).get());

        return addressRepository.save(address);
    }

    public Address createAddressWithExistingEmployee(Address address){
        Address address2=new Address();
        address2.setStreet(address.getStreet());
        address2.setArea(address.getArea());
        address2.setPincode(address.getPincode());
        address2.setEmployee(employeeRepository.findById(address.getEmployee().geteId()).get());
        return addressRepository.save(address2);
        


    }

    public void deleteAddressById(Long aId){
        addressRepository.deleteById(aId);
    }
    
}
