package com.datajpa.datajpa.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datajpa.datajpa.Entity.Student;
import com.datajpa.datajpa.Service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student>getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/{lName}")
    public List<Student>getByLName(@PathVariable String lName){
        return studentService.findByLName(lName);
    }
    
    @GetMapping("/{id}")
    public Optional<Student>getStudentById(@PathVariable Long id){
       // return studentService.getStudentById(id);
        Optional<Student> optionalStudent = studentService.getStudentById(id);
        return optionalStudent;     
    }
    

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent){
        Optional<Student> optionalStudent = studentService.updateStudent(id, updatedStudent);
        return optionalStudent.map(student->new ResponseEntity<>(student,HttpStatus.OK))
        .orElseGet(()-> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    } 
   
}
