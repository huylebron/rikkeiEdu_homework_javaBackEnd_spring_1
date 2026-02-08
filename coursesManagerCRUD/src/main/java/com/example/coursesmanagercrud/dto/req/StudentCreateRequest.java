package com.example.coursesmanagercrud.dto.req;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record StudentCreateRequest(

        @NotBlank String name,
        @NotBlank @Email String email



) {
}
