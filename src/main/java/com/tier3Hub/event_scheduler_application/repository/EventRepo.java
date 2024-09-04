package com.tier3Hub.event_scheduler_application.repository;

import com.tier3Hub.event_scheduler_application.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepo extends JpaRepository<Event,Integer> {

}
