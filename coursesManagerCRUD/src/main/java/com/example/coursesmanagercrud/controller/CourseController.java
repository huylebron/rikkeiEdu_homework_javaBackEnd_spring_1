package com.example.coursesmanagercrud.controller;

import com.example.coursesmanagercrud.common.ApiResponse;
import com.example.coursesmanagercrud.dto.req.CourseCreateRequest;
import com.example.coursesmanagercrud.dto.req.CourseUpdateRequest;
import com.example.coursesmanagercrud.repository.CourseRepository;
import com.example.coursesmanagercrud.services.courses.CourseService;
import com.example.coursesmanagercrud.services.courses.CourseServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.locks.ReentrantLock;
@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService ;


    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public ResponseEntity<ApiResponse<Void>> create (@Valid @RequestBody CourseCreateRequest request){
        courseService.create(request);
        return ResponseEntity.ok(ApiResponse.ok( "course created ", null)) ;

    }
    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> update (@PathVariable Long id , @Valid @RequestBody CourseUpdateRequest request) {
        courseService.update(id,request);
        return ResponseEntity.ok(ApiResponse.ok("Course updated", null));
    }

    }

