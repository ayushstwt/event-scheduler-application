package com.tier3Hub.event_scheduler_application.controller;

import com.tier3Hub.event_scheduler_application.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventService eventService;


}
