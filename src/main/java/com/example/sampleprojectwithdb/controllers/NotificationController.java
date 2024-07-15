package com.example.sampleprojectwithdb.controllers;

import com.example.sampleprojectwithdb.models.Notification;
import com.example.sampleprojectwithdb.models.Subscription;
import com.example.sampleprojectwithdb.service.NotificationService;
import com.example.sampleprojectwithdb.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    @Autowired
    NotificationService notificationService;

    @Autowired
    SubscriptionService subscriptionService;

    @PostMapping("notification")
    public Notification createNotification(@RequestBody Notification notification) {
        notificationService.createNotification(notification);
        return notification;
    }

    @PostMapping("/subscription")
    public Subscription createSubscription(@RequestBody Subscription subscription) {
        subscriptionService.createSubscription(subscription);
        return subscription;
    }
}
