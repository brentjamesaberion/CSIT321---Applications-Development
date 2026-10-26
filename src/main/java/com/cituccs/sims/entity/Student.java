package com.cituccs.sims.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table (name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int studentId;
    private String studentName;

    @ManyToMany
    @JoinTable(
            name = "student_course",
            joinColumns= @JoinColumn(name="student_id"),
            inverseJoinColumns=@JoinColumn(name="course_id")
    )
    private List<Course> courseList;// n - n
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Program program;
    private int year;
}
