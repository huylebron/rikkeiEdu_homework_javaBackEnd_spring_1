package com.example.springbootcrud.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record BookRequest(

        @NotBlank(message = "ko dc de trong ")
        String title,

        @NotBlank(message = "Tác giả không được để trống")
        String author,

        @NotNull(message = " gia khongo duoc dee trong ")
        @Min(value = 0, message = " Gia phai > 0 ")
        BigDecimal price) {
}
