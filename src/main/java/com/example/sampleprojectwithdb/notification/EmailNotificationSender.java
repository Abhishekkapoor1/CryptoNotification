package com.example.sampleprojectwithdb.notification;

import com.example.sampleprojectwithdb.models.Notification;
import com.example.sampleprojectwithdb.models.Subscription;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmailNotificationSender implements NotificationSender{

    @Override
    public void sendNotification(Notification notification, List<Subscription> subscriptionList) {
        for(Subscription subscription: subscriptionList) {
            System.out.println("sending notification to"+subscription.getEmailAddress()+" with name "+notification.getCurrency());
        }
    }
}
