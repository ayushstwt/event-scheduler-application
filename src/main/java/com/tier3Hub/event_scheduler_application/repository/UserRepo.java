package com.tier3Hub.event_scheduler_application.repository;

import com.tier3Hub.event_scheduler_application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
