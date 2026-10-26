package com.cituccs.sims.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "courses")
public class Course { //CSIT321
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;
    private String courseCode;
    private String courseName;
    @ManyToMany(mappedBy = "courseList")
    private List<Student> studentlist; //n-n
}
