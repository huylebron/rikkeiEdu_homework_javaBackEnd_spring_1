package com.example.coursesmanagercrud.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String title;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private CourseStatus status;

    // Giai đoạn bước 2: chỉ lưu FK dạng primitive, chưa mapping quan hệ
    @ManyToOne( fetch = FetchType.LAZY ,optional = false)
    @JoinColumn(name = "instructor_id", nullable = false)
   private Instructor instructor ;


    @OneToMany(mappedBy = "course")

    private List<StudentEnrollment> enrollments = new ArrayList<>() ;

    public List<StudentEnrollment> getEnrollments() { return enrollments ; }



    protected Course() {
    }

    public Course(String title, CourseStatus status, Instructor instructor) {
        this.title = title;
        this.status = status;
        this.instructor = instructor;


    }
    // getters/setters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public CourseStatus getStatus() { return status; }
    public void setStatus(CourseStatus status) { this.status = status; }
    public Instructor getInstructor() { return instructor; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }


}
