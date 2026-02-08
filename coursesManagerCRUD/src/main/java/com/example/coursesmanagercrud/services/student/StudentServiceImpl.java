package com.example.coursesmanagercrud.services.student;

import com.example.coursesmanagercrud.dto.req.StudentCreateRequest;
import com.example.coursesmanagercrud.entity.Student;
import com.example.coursesmanagercrud.repository.StudentRepository;

public class StudentServiceImpl implements IStudentService{

    private final StudentRepository studentRepository ;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public void create(StudentCreateRequest request) {
        Student student = new Student(request.name(),request.email());

        studentRepository.save(student) ;

    }
}
