package com.example.validation.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserReq (

        @NotBlank(message = "must not be blank")
        @Size(min = 8, message = "must be at least 8 characters")
        String username,

        @NotBlank(message = "must not be blank")
        @Email(message = "invalid email")
        String email,

        @NotBlank(message = "password is required")
        @Size(min = 8, message = "must be 8 at least characters")
        String password,

        @Min(value = 18, message = "age must be 18 or above")
        int age
) {}
