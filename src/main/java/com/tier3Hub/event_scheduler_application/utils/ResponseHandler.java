package com.tier3Hub.event_scheduler_application.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {

    public ResponseEntity<Object> generateResponse(String message, HttpStatus status, Object response){
        Map<String, Object> map = new HashMap<>();
        map.put("message",message);
        map.put("status",status.value());
        map.put("object",response);

        return new ResponseEntity<Object>(map,status);
    }
}
