package com.example.coursesmanagercrud.services.instructor;

import com.example.coursesmanagercrud.dto.req.InstructorCreateRequest;
import com.example.coursesmanagercrud.entity.Instructor;
import com.example.coursesmanagercrud.repository.InstructorRepository;
import org.springframework.stereotype.Service;

@Service
public class InstructorServiceImpl implements IInstructorService {

    private final InstructorRepository instructorRepository ;

    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }


    /**
     * @param request
     */
    @Override
    public void create(InstructorCreateRequest request) {

        Instructor instructor = new Instructor(request.name() , request.email()) ;
        instructorRepository.save(instructor)  ;



    }





}
