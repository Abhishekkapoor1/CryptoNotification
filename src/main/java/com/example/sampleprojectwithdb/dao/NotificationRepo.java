package com.example.sampleprojectwithdb.dao;

import com.example.sampleprojectwithdb.models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepo extends JpaRepository<Notification, Integer> {

}
