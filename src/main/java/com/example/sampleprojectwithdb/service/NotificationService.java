package com.example.sampleprojectwithdb.service;

import com.example.sampleprojectwithdb.dao.NotificationRepo;
import com.example.sampleprojectwithdb.dao.SubscriptionRepo;
import com.example.sampleprojectwithdb.models.Currency;
import com.example.sampleprojectwithdb.models.Notification;
import com.example.sampleprojectwithdb.models.Subscription;
import com.example.sampleprojectwithdb.notification.NotificationSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
    @Autowired
    SubscriptionRepo subscriptionRepo;
    @Autowired
    NotificationRepo notificationRepo;
   @Autowired
    NotificationSender notificationSender;

    public Notification createNotification(Notification notification) {
        notificationRepo.save(notification);
        Currency currency = notification.getCurrency();
        List<Subscription> subscriptionList = subscriptionRepo.findByCurrency(currency);
        notificationSender.sendNotification(notification, subscriptionList);
        return notification;
    }
}
