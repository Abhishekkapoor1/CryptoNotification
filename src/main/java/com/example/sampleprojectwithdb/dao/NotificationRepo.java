package com.example.sampleprojectwithdb.dao;

import com.example.sampleprojectwithdb.models.Currency;
import com.example.sampleprojectwithdb.models.Notification;
import com.example.sampleprojectwithdb.models.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepo extends JpaRepository<Notification, Integer> {
    List<Notification> findByCurrency(Currency currency);
}
