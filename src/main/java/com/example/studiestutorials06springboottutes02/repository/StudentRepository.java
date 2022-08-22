package com.example.studiestutorials06springboottutes02.repository;

import com.example.studiestutorials06springboottutes02.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
