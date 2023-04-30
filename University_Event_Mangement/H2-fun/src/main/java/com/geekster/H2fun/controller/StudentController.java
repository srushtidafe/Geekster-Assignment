package com.geekster.H2fun.controller;

import com.geekster.H2fun.models.Student;
import com.geekster.H2fun.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/getStudent")
    public Iterable<Student> getStudents(){
       return studentService.getAllStudents();
    }
    @GetMapping(value = "/getStudent/{studentId}")
    public void getStudentById( @PathVariable Integer studentId){ studentService.getStudentById(studentId);
    }
    @PostMapping(value = "/addStudent")
    public String addStudent( @Validated @RequestBody List<Student> studentList){
        return studentService.addStudent(studentList);
    }
    @DeleteMapping(value ="/Student/{studentId}")
    public void removeById(Integer studentId){
         studentService.removeStudentById(studentId);
    }
    @PutMapping(value = "/update")
    public void updateStudentById(Integer studentId){
        studentService.updateStudentById( studentId);
    }
}
