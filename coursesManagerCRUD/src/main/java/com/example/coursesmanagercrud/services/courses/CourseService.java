package com.example.coursesmanagercrud.services.courses;

import com.example.coursesmanagercrud.dto.req.CourseCreateRequest;
import com.example.coursesmanagercrud.dto.req.CourseUpdateRequest;

public interface CourseService {
    void create (CourseCreateRequest request) ;
    void update (Long id , CourseUpdateRequest request) ;

}
