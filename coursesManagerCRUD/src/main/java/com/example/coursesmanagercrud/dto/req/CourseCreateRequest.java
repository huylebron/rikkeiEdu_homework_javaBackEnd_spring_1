package com.example.coursesmanagercrud.dto.req;

import com.example.coursesmanagercrud.entity.CourseStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CourseCreateRequest(
        @NotBlank String title,
        @NotNull CourseStatus status,
        @NotNull Long instructorId


) {
}
