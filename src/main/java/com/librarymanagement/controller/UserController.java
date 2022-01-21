package com.librarymanagement.controller;

import com.librarymanagement.entity.Student;
import com.librarymanagement.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class UserController {

    @Autowired
    IStudentService service;

    @PostMapping("/register")
    ResponseEntity<Student> registerStudent(@RequestBody Student student){
        return new ResponseEntity<>(service.registerStudent(student) , HttpStatus.OK);
    }
}
