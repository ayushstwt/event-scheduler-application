package com.tier3Hub.event_scheduler_application.service;

import com.tier3Hub.event_scheduler_application.dto.CreateEventDto;
import com.tier3Hub.event_scheduler_application.dto.EventResponse;
import com.tier3Hub.event_scheduler_application.dto.UpdateEventDto;

public interface EventService {
    EventResponse createEvent(CreateEventDto createEventDto);

    void deleteEvent(int id);

    EventResponse updateEvent(UpdateEventDto updateEventDto);
}
