package com.example.coursesmanagercrud.services.student;

import com.example.coursesmanagercrud.dto.req.StudentEnrollmentCreateRequest;
import com.example.coursesmanagercrud.entity.Student;
import com.example.coursesmanagercrud.entity.StudentEnrollment;

public interface IStudentEnrollmentService {

    void enroll (StudentEnrollmentCreateRequest request) ;

}
