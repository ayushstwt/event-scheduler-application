package com.tier3Hub.event_scheduler_application.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserDto {

    @NotBlank(message = "User email is required")
    @NotNull(message = "User email should not be null")
    @Email
    private String email;

    @NotBlank(message = "First Name is required")
    private String firstName;

    private String lastName;

    @NotBlank(message = "Mobile Number is required")
    private String mobileNumber;

    @NotBlank(message = "Password is required")
    private String password;

    @NotBlank(message = "DAte of Birth is required")
    private String dateOfBirth;


}
