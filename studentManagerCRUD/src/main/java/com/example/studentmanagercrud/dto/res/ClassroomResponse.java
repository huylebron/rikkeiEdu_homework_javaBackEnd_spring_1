package com.example.studentmanagercrud.dto.res;

import java.io.Serializable;

/**
 * DTO for {@link com.example.studentmanagercrud.entity.Classroom}
 */
public record ClassroomResponse(Long id, String code, String name) implements Serializable {
}