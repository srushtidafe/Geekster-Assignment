package com.geekster.H2fun.services;

import com.geekster.H2fun.models.Student;
import com.geekster.H2fun.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired IStudentRepository studentRepository;

    public Iterable<Student> getAllStudents() {
Iterable<Student> allStudent = studentRepository.findAll();
return allStudent;
    }

    public String addStudent(List<Student> studentList) {
        Iterable<Student> addStudent =studentRepository.saveAll(studentList);
        if(addStudent != null){
            return "Added";
        }else{
            return "Not Added";
        }
    }

    public void removeStudentById(Integer id) {
         studentRepository.deleteById(id);
    }

    public void getStudentById(Integer id) {
        studentRepository.findById(id);

    }

    public void updateStudentById( Integer studentId) {
           studentRepository.findById(studentId);
    }
}
