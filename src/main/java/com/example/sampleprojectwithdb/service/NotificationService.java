package com.example.sampleprojectwithdb.service;

import com.example.sampleprojectwithdb.dao.NotificationRepo;
import com.example.sampleprojectwithdb.dao.SubscriptionRepo;
import com.example.sampleprojectwithdb.models.Currency;
import com.example.sampleprojectwithdb.models.Notification;
import com.example.sampleprojectwithdb.models.NotificationStatus;
import com.example.sampleprojectwithdb.models.Subscription;
import com.example.sampleprojectwithdb.notification.NotificationSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class NotificationService {
    @Autowired
    SubscriptionRepo subscriptionRepo;
    @Autowired
    NotificationRepo notificationRepo;
   @Autowired
    NotificationSender notificationSender;

    public Notification createNotification(Notification notification) {
        notification.setNotificationStatus(NotificationStatus.in_progress);
        notificationRepo.save(notification);
        Currency currency = notification.getCurrency();
        List<Subscription> subscriptionList = subscriptionRepo.findByCurrency(currency);
        try {
            notificationSender.sendNotification(notification, subscriptionList);
            notification.setNotificationStatus(NotificationStatus.success);
            notificationRepo.save(notification);
        } catch (Exception exception) {
            notification.setNotificationStatus(NotificationStatus.failed);
            notificationRepo.save(notification);
        }
        return notification;
    }

    public Notification getNotificationById(Integer id) {
        Optional<Notification> notification = notificationRepo.findById(id);
        if(notification.isEmpty()) {
            throw new NoSuchElementException();
        }
        return notification.get();
    }

    public List<Notification> getNotificationBYCurrency(Currency currency) {
        List<Notification> notifications = notificationRepo.findByCurrency(currency);
        return notifications;
    }

    public void deleteNotification(Integer id) {
        notificationRepo.deleteById(id);
    }
}
