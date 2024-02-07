package com.datajpa.datajpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datajpa.datajpa.Entity.Student;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

    public List<Student>findByLName(String lName);
    
}
