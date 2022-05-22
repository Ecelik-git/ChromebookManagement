package com.dove.chromebookmanagementsystem.controller;

import java.util.List;

import com.dove.chromebookmanagementsystem.model.Student;
import com.dove.chromebookmanagementsystem.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }


}
