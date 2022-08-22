package com.example.studiestutorials06springboottutes02.controller;

import com.example.studiestutorials06springboottutes02.entity.Student;
import com.example.studiestutorials06springboottutes02.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<?> createNewStudent(
            @RequestBody Student student
    ) {
        studentService.createNewStudent(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
