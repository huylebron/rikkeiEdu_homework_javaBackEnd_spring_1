package com.example.coursesmanagercrud.repository;

import com.example.coursesmanagercrud.entity.Course;
import com.example.coursesmanagercrud.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long > {


}
