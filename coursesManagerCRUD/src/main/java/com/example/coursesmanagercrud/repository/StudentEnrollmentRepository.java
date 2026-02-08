package com.example.coursesmanagercrud.repository;

import com.example.coursesmanagercrud.entity.StudentEnrollment;
import org.aspectj.apache.bcel.generic.LineNumberGen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentEnrollmentRepository  extends JpaRepository<StudentEnrollment , Long > {

    boolean existsByCourseIdAndStudentId(Long courseId , Long studentId) ;



}
