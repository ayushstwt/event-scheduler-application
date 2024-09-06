package com.tier3Hub.event_scheduler_application.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String email;

    @Pattern(regexp = "^[a-zA-Z]*$",message = "First Name should not be characters or digit")
    @Size(min = 4,max = 10,message = "First Name should not be of less than 4 and more than 10 characters")
    @Column(nullable = false)
    private String firstName;

    @Pattern(regexp = "^[a-zA-Z]*$",message = "Last Name should not be characters or digit")
    @Size(min = 4,max = 15,message = "Last Name should not be of less than 4 and more than 15 characters")
    @Column(nullable = false)
    private String lastName;

    @Pattern(regexp = "^\\d{10}$",message = "Last Name should not be characters or digit")
    @Size(min = 10,max = 10,message = "Mobile number should be of 10 digits")
    @Column(nullable = false)
    private String mobileNumber;

    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\\\S+$).{8,20}$", message = "Password must have one capital and small letter and a digit and special symbol")
    private String password;

    @Column(name = "dob",columnDefinition = "DATE")
    private LocalDate dateOfBirth;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Event> events = new ArrayList<>();

    @Column(name = "created_At")
    private LocalDateTime createdAt;

    @Column(name = "updated_At")
    private LocalDateTime updatedAT;

}
