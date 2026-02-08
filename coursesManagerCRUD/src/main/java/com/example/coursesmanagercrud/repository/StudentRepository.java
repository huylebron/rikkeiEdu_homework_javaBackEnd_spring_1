package com.example.coursesmanagercrud.repository;

import com.example.coursesmanagercrud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student , Long > {


}
