package com.example.studiestutorials06springboottutes02.repository;

import com.example.studiestutorials06springboottutes02.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
