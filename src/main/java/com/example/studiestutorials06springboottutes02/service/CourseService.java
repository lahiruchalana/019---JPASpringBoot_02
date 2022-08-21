package com.example.studiestutorials06springboottutes02.service;

import com.example.studiestutorials06springboottutes02.entity.Course;
import com.example.studiestutorials06springboottutes02.repository.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void createNewCourse(Course course) {
        courseRepository.save(course);
    }
}
