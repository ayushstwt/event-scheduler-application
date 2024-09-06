package com.tier3Hub.event_scheduler_application.controller;

import com.tier3Hub.event_scheduler_application.dto.CreateEventDto;
import com.tier3Hub.event_scheduler_application.dto.UpdateEventDto;
import com.tier3Hub.event_scheduler_application.service.EventService;
import com.tier3Hub.event_scheduler_application.utils.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calender/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/create")
    public ResponseEntity<Object> createEvent(@RequestBody CreateEventDto createEventDto) {
        return new ResponseHandler().generateResponse("Event created successfully", HttpStatus.OK, eventService.createEvent(createEventDto));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteEvent(@PathVariable int id) {
        eventService.deleteEvent(id);
        return new ResponseHandler().generateResponse("Event deleted successfully", HttpStatus.OK, null);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Object> updateEvent(@PathVariable int id, @RequestBody UpdateEventDto updateEventDto) {
        return new ResponseHandler().generateResponse("Event updated successfully", HttpStatus.OK, eventService.updateEvent(updateEventDto));
    }
}
