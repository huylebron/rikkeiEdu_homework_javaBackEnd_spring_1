package com.example.studentmanagercrud.dto.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

/**
 * DTO for {@link com.example.studentmanagercrud.entity.Classroom}
 */
public record ClassroomCreateRequest(@Size(min = 50) @NotBlank String code,
                                     @Size(max = 255) @NotBlank String name) implements Serializable {
}