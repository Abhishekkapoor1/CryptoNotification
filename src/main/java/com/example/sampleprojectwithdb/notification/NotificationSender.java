package com.example.sampleprojectwithdb.notification;

import com.example.sampleprojectwithdb.models.Notification;
import com.example.sampleprojectwithdb.models.Subscription;

import java.util.List;

public interface NotificationSender {
    void sendNotification(Notification notification, List<Subscription> subscriptionList);
}
