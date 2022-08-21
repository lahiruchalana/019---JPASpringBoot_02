package com.example.studiestutorials06springboottutes02.entity;

import javax.persistence.*;

@Entity
@Table(name = "teacher_tbl")
public class Teacher {

    @Id
    @SequenceGenerator(
            name = "teacher_sequence",
            sequenceName = "teacher_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "teacher_sequence"
    )
    private Long teacherId;
    private String teacherName;
    private Integer teacherAge;

    @ManyToOne(
//            cascade = CascadeType.ALL,  // allows to teacher instances to create a teacher without saved courses (if there is not this Cascade type you can use available instance courseId)
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "course_id",
            referencedColumnName = "courseId"
    )
    private Course course;

    public Teacher() {
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teacher(Long teacherId, String teacherName, Integer teacherAge) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherAge = teacherAge;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(Integer teacherAge) {
        this.teacherAge = teacherAge;
    }
}
