package com.example.coursesmanagercrud.services.courses;

import com.example.coursesmanagercrud.dto.req.CourseCreateRequest;
import com.example.coursesmanagercrud.dto.req.CourseUpdateRequest;
import com.example.coursesmanagercrud.entity.Course;
import com.example.coursesmanagercrud.entity.Instructor;
import com.example.coursesmanagercrud.exception.NotFoundException;
import com.example.coursesmanagercrud.repository.CourseRepository;
import com.example.coursesmanagercrud.repository.InstructorRepository;

public class CourseServiceImpl implements CourseService{


    private final CourseRepository courseRepository ;
    private final InstructorRepository instructorRepository ;


    public CourseServiceImpl(CourseRepository courseRepository, InstructorRepository instructorRepository) {
        this.courseRepository = courseRepository;
        this.instructorRepository = instructorRepository;
    }

    /**
     * @param request
     */
    @Override
    public void create(CourseCreateRequest request) {

        Instructor instructor = instructorRepository.findById(request.instructorId())
                .orElseThrow(() -> new NotFoundException("instructor not found " + request.instructorId()));

        Course course = new Course(request.title(), request.status() , instructor ) ;
        courseRepository.save(course) ;



    }

    /**
     * @param id
     * @param request
     */
    @Override
    public void update(Long id, CourseUpdateRequest request) {

       Course course = courseRepository.findById(id )
               .orElseThrow(() -> new NotFoundException("Course not found "+ id )) ;

       Instructor instructor = instructorRepository.findById(request.instructorId())
               .orElseThrow(() -> new NotFoundException("instructor not found "+request.instructorId())) ;

       course.setTitle(request.title());
       course.setStatus(request.status());
       course.setInstructor(instructor);

       courseRepository.save(course) ;
       



    }



}
