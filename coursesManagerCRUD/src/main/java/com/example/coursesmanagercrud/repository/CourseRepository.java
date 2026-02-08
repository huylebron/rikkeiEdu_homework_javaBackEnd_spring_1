package com.example.coursesmanagercrud.repository;

import com.example.coursesmanagercrud.entity.Course;
import com.example.coursesmanagercrud.entity.CourseStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course , Long > {

boolean existsByIdAndStatus (Long id , CourseStatus status) ;

}
