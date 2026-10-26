package com.cituccs.sims.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "programs")
public class Program { //BSIT
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int programId;
    private String programCode;
    private String programName;
    @OneToMany(mappedBy = "program")
    private List<Student> studentList; //n-n
}
