package com.datajpa.datajpa.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datajpa.datajpa.Entity.Student;
import com.datajpa.datajpa.Repository.StudentRepository;


@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student>getAllStudents(){
        return studentRepository.findAll();
    }
    public List<Student>findByLName(String lName){
        return studentRepository.findByLName(lName);
    }    
 
    public Optional<Student>getStudentById(Long id){
        return studentRepository.findById(id);
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }

    public Optional<Student> updateStudent(Long id, Student updatedStudent){
        return studentRepository.findById(id).map(student->{
            student.setfName(updatedStudent.getfName());
            student.setlName(updatedStudent.getlName());
            student.setEmail(updatedStudent.getEmail());
            return studentRepository.save(student);
        });
    }
    
}
