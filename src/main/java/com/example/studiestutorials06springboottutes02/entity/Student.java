package com.example.studiestutorials06springboottutes02.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student_tbl")
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long studentId;
    private String studentName;
    private Integer studentAge;

    @ManyToMany
    @JoinTable(
            name = "course_student_tbl",
            joinColumns = @JoinColumn(
                    name = "student_id",
                    referencedColumnName = "studentId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "course_id",
                    referencedColumnName = "courseId"
            )
    )
    private List<Course> courses;

    // getters and setters should be there for courses
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Student() {
    }

    public Student(Long studentId, String studentName, Integer studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }
}
