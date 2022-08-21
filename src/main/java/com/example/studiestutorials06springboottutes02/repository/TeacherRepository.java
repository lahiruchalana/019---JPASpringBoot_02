package com.example.studiestutorials06springboottutes02.repository;

import com.example.studiestutorials06springboottutes02.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
