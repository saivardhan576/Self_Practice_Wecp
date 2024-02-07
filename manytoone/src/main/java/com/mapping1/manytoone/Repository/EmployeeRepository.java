package com.mapping1.manytoone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping1.manytoone.Entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    
}
