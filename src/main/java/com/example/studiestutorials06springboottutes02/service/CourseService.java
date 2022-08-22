package com.example.studiestutorials06springboottutes02.service;

import com.example.studiestutorials06springboottutes02.entity.Course;
import com.example.studiestutorials06springboottutes02.repository.CourseRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void createNewCourse(Course course) {
        courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public List<Course> getCoursesWithSorting(String property) {        // sorting with the property and ascending order
        return courseRepository.findAll(Sort.by(Sort.Direction.ASC, property));
    }
}
