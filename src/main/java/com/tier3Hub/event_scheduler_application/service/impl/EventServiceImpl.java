package com.tier3Hub.event_scheduler_application.service.impl;

import com.tier3Hub.event_scheduler_application.dto.CreateEventDto;
import com.tier3Hub.event_scheduler_application.dto.EventResponse;
import com.tier3Hub.event_scheduler_application.dto.UpdateEventDto;
import com.tier3Hub.event_scheduler_application.entity.Event;
import com.tier3Hub.event_scheduler_application.exception.RecordNotFoundException;
import com.tier3Hub.event_scheduler_application.repository.EventRepo;
import com.tier3Hub.event_scheduler_application.service.EventService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepo eventRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public EventResponse createEvent(CreateEventDto createEventDto) {
        Event event = modelMapper.map(createEventDto, Event.class);
        Event save = eventRepo.save(event);
        return modelMapper.map(save, EventResponse.class);
    }

    @Override
    public void deleteEvent(int id) {
        Event eventNotFound = eventRepo.findById(id).orElseThrow(() -> new RecordNotFoundException("Event not found"));
        eventRepo.delete(eventNotFound);
    }

    @Override
    public EventResponse updateEvent(UpdateEventDto updateEventDto) {
        Event eventNotFound = eventRepo.findById(updateEventDto.getEventId()).orElseThrow(() -> new RecordNotFoundException("Event not found"));
        eventNotFound.setEventName(updateEventDto.getEventName());
        eventNotFound.setEventType(updateEventDto.getEventType());
        eventNotFound.setUpdatedAt(LocalDateTime.now());
        eventNotFound.setEndDate(updateEventDto.getEndDate());
        eventNotFound.setStartDate(updateEventDto.getStartDate());
        eventNotFound.setEndTime(updateEventDto.getEndTime());
        eventNotFound.setStartTime(updateEventDto.getStartTime());
        Event save = eventRepo.save(eventNotFound);
        return modelMapper.map(save, EventResponse.class);
    }
}
