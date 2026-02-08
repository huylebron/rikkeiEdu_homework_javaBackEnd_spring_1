package com.example.coursesmanagercrud.services.student;

import com.example.coursesmanagercrud.dto.req.StudentEnrollmentCreateRequest;
import com.example.coursesmanagercrud.entity.Course;
import com.example.coursesmanagercrud.entity.Student;
import com.example.coursesmanagercrud.entity.StudentEnrollment;
import com.example.coursesmanagercrud.exception.BadRequestException;
import com.example.coursesmanagercrud.exception.NotFoundException;
import com.example.coursesmanagercrud.repository.CourseRepository;
import com.example.coursesmanagercrud.repository.StudentEnrollmentRepository;
import com.example.coursesmanagercrud.repository.StudentRepository;

public class StudentEnrollmentServiceImpl implements IStudentEnrollmentService{

    private final StudentRepository studentRepository ;
    private  final CourseRepository courseRepository  ;
    private final StudentEnrollmentRepository enrollmentRepository ;

    public StudentEnrollmentServiceImpl(StudentRepository studentRepository, CourseRepository courseRepository, StudentEnrollmentRepository enrollmentRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
        this.enrollmentRepository = enrollmentRepository;
    }


    @Override
    public void enroll(StudentEnrollmentCreateRequest request) {
       Student student = studentRepository.findById(request.studentId())
               .orElseThrow(() -> new NotFoundException("Student not found " + request.studentId()));

        Course course = courseRepository.findById(request.courseId())
                .orElseThrow(() -> new NotFoundException("Course not found" + request.courseId()));

        boolean existed = enrollmentRepository.existsByCourseIdAndStudentId(request.courseId(), request.studentId()) ;

        if ( existed) throw new BadRequestException("student alrealy enrolled in this course") ;
        enrollmentRepository.save(new StudentEnrollment(student,course)) ;




    }
}
