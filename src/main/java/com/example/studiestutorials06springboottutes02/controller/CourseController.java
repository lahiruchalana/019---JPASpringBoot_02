package com.example.studiestutorials06springboottutes02.controller;

import com.example.studiestutorials06springboottutes02.entity.Course;
import com.example.studiestutorials06springboottutes02.service.CourseService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/course")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public ResponseEntity<?> addNewCourse(
            @RequestBody Course course
    ) {
        courseService.createNewCourse(course);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        return new ResponseEntity<>(courseService.getAllCourses(), HttpStatus.OK);
    }

    @GetMapping(path = "{property}")        // sorting by property
    public ResponseEntity<List<Course>> getCoursesWithSorting(
            @PathVariable("property") String property
    ) {
        return new ResponseEntity<>(courseService.getCoursesWithSorting(property), HttpStatus.OK);
    }

    @GetMapping(path = "{pageNumber}/{pageSize}")       // pagination
    public ResponseEntity<Page<Course>> getCoursesWithPagination(
            @PathVariable("pageNumber") Integer pageNumber,
            @PathVariable("pageSize") Integer pageSize
    ) {
        return new ResponseEntity<>(courseService.getCoursesWithPagination(pageNumber, pageSize), HttpStatus.OK);
    }

    @GetMapping(path = "{pageNumber}/{pageSize}/{property}")
    public ResponseEntity<Page<Course>> getCoursesWithPaginationAndSorting(
            @PathVariable("pageNumber") Integer pageNumber,
            @PathVariable("pageSize") Integer pageSize,
            @PathVariable("property") String property
    ) {
        return new ResponseEntity<>(courseService.getCoursesWithPaginationAndSorting(pageNumber, pageSize, property), HttpStatus.OK);
    }
}
