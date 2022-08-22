package com.example.studiestutorials06springboottutes02.service;

import com.example.studiestutorials06springboottutes02.entity.Student;
import com.example.studiestutorials06springboottutes02.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void createNewStudent(Student student) {
        studentRepository.save(student);
    }
}
