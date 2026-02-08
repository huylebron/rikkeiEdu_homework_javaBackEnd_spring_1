package com.example.coursesmanagercrud.dto.req;

import com.example.coursesmanagercrud.entity.CourseStatus;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record InstructorCreateRequest(

        @NotBlank String name,
        @NotBlank @Email String email
        ) {
}
