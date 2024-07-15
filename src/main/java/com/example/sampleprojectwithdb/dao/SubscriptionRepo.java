package com.example.sampleprojectwithdb.dao;

import com.example.sampleprojectwithdb.models.Currency;
import com.example.sampleprojectwithdb.models.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscriptionRepo extends JpaRepository<Subscription, Integer> {
    List<Subscription> findByCurrency(Currency currency);
}
