package com.example.sampleprojectwithdb.controllers;

import com.example.sampleprojectwithdb.models.Currency;
import com.example.sampleprojectwithdb.models.Notification;
import com.example.sampleprojectwithdb.models.Subscription;
import com.example.sampleprojectwithdb.service.NotificationService;
import com.example.sampleprojectwithdb.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


    @GetMapping("/notification")
    public List<Notification> getNotification(@RequestParam(required = false) Integer notificationId,
                                             @RequestParam(required = false) Currency currency) {
        if(notificationId == null && currency == null) {
            throw new IllegalArgumentException();
        }
        if(notificationId != null) {
            return List.of(notificationService.getNotificationById(notificationId));
        } else {
            return notificationService.getNotificationBYCurrency(currency);
        }

    }


    @DeleteMapping("/notification/{notificationId}")
    public void deleteNotification(@PathVariable Integer notificationId) {
        notificationService.deleteNotification(notificationId);

    }
}
