package com.example.studentmanagercrud.dto.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

/**
 * DTO for {@link com.example.studentmanagercrud.entity.Classroom}
 */
public record ClassroomUpdateRequest(@Size @NotBlank String name) implements Serializable {
}