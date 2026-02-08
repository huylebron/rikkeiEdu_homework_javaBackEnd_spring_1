package com.example.coursesmanagercrud.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;import java.util.List;



@Entity

@Table(name = "instructors")

public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String name;
    @Column(nullable = false, length = 150)
    private String email;

@OneToMany(mappedBy = "instructor")
private List<Course> courses = new ArrayList<>() ;

    public Instructor(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Instructor(@NotBlank String name, @NotBlank @Email String email) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Course> getCourses() { return courses; }
}





