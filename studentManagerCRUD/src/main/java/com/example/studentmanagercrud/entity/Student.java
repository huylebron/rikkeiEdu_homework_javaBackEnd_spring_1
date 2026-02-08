package com.example.studentmanagercrud.entity;

import jakarta.persistence.*;
import org.hibernate.Length;

@Entity
@Table( name = "students")

public class Student extends BaseEntity{

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column( name = "student_code", nullable = false , unique = true , length = 50)
    private String studentCode ;
    @Column(name = "full_name", nullable = false)
    private String fullName;
    @Column( nullable = false , unique = true)
    private String email ;
    @Column(length = 30)
    private String phone ;
    @Enumerated(EnumType.STRING)
private Gender gender ;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false )
    private StudentStatus status ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classroom_id", nullable = false)
    private Classroom classroom ;



}
