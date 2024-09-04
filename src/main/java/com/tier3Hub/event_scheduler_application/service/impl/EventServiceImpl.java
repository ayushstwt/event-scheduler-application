package com.tier3Hub.event_scheduler_application.service.impl;

import com.tier3Hub.event_scheduler_application.repository.EventRepo;
import com.tier3Hub.event_scheduler_application.service.EventService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {


    @Autowired
    private EventRepo eventRepo;

    @Autowired
    private ModelMapper modelMapper;

}
