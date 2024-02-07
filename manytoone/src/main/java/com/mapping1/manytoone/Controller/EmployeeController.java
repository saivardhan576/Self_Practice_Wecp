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

import com.mapping1.manytoone.Entity.Employee;
import com.mapping1.manytoone.Service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employee/{eId}")
    public Optional<Employee> getEmployeesById(@PathVariable Long eId){
        return employeeService.getEmployeesById(eId);
    }
    @PostMapping("/employee")
    public Employee saveEmployees(@RequestBody Employee employee){
        return employeeService.saveEmployees(employee);
    }

    @DeleteMapping("/employee/{eId}")
    public void deleteEmployeeById(@PathVariable Long eId){
        employeeService.deleteEmployeesById(eId);
    
    }
    
}
