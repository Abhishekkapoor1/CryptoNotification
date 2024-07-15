package com.example.sampleprojectwithdb.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class NotificationHistory {
    @GeneratedValue
    @Id
    int id;
    int notificationid;
    int subscriptionid;
    NotificationStatus status;
    LocalDateTime sentTime;

    public NotificationHistory() {
    }

    public NotificationHistory(int id, int notificationid, int subscriptionid, LocalDateTime sentTime) {
        this.id = id;
        this.notificationid = notificationid;
        this.subscriptionid = subscriptionid;
        this.sentTime = sentTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNotificationid() {
        return notificationid;
    }

    public void setNotificationid(int notificationid) {
        this.notificationid = notificationid;
    }

    public int getSubscriptionid() {
        return subscriptionid;
    }

    public void setSubscriptionid(int subscriptionid) {
        this.subscriptionid = subscriptionid;
    }

    public LocalDateTime getSentTime() {
        return sentTime;
    }

    public void setSentTime(LocalDateTime sentTime) {
        this.sentTime = sentTime;
    }

    public NotificationStatus getStatus() {
        return status;
    }

    public void setStatus(NotificationStatus status) {
        this.status = status;
    }
}
