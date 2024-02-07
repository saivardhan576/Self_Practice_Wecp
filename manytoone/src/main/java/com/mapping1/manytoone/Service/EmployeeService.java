package com.mapping1.manytoone.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping1.manytoone.Entity.Employee;
import com.mapping1.manytoone.Repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeesById(Long aId){
        return employeeRepository.findById(aId);
    }    

    public Employee saveEmployees(Employee employee){
    return employeeRepository.save(employee);
    }

    public void deleteEmployeesById(Long aId){
        employeeRepository.deleteById(aId);
    }
    
}
