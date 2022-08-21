package com.example.studiestutorials06springboottutes02.repository;

import com.example.studiestutorials06springboottutes02.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
