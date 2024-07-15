package com.example.sampleprojectwithdb.service;

import com.example.sampleprojectwithdb.dao.SubscriptionRepo;
import com.example.sampleprojectwithdb.models.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {
    @Autowired
    SubscriptionRepo subscriptionRepo;

    public Subscription createSubscription(Subscription subscription) {
        subscriptionRepo.save(subscription);
        return subscription;
    }
}
