package com.tier3Hub.event_scheduler_application.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateEventDto {

    @NotBlank(message = "Event Id is required")
    private int eventId;

    @NotBlank(message = "Event Name is required")
    private String eventName;

    @NotBlank(message = "Event type is required")
    private String eventType;

    @NotBlank(message = "Start Date is required")
    private LocalDate startDate;

    @NotBlank(message = "End Date is required")
    private LocalDate endDate;

    @NotBlank(message = "Start time is required")
    private LocalTime startTime;

    @NotBlank(message = "End time is required")
    private LocalTime endTime;

}
