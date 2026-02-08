package com.example.coursesmanagercrud.dto.req;

import jakarta.validation.constraints.NotNull;

public record StudentEnrollmentCreateRequest(
        @NotNull Long studentId,
        @NotNull Long courseId



) {
}
