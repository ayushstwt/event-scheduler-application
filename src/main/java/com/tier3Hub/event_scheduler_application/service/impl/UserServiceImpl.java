package com.tier3Hub.event_scheduler_application.service.impl;

import com.tier3Hub.event_scheduler_application.repository.UserRepo;
import com.tier3Hub.event_scheduler_application.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;
}
