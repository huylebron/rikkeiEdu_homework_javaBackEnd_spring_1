package com.example.coursesmanagercrud.controller;

import com.example.coursesmanagercrud.common.ApiResponse;
import com.example.coursesmanagercrud.dto.req.InstructorCreateRequest;
import com.example.coursesmanagercrud.services.instructor.IInstructorService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/instructors")
public class InstructorController {
    private final IInstructorService iInstructorService ;


    public InstructorController(IInstructorService iInstructorService) {
        this.iInstructorService = iInstructorService;
    }

    @PostMapping
    public ResponseEntity<ApiResponse<Void>> create (@Valid @RequestBody InstructorCreateRequest request) {

        iInstructorService.create(request);
         return ResponseEntity.ok(ApiResponse.ok("course create ",null));

    }



}
