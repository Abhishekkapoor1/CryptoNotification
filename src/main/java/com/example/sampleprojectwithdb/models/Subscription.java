package com.example.sampleprojectwithdb.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Subscription {
    @Id
    @GeneratedValue
    private int id;
    private Currency currency;
    private String emailAddress;

    public Subscription() {
    }

    public Subscription(Currency currency, String emailAddress) {
        this.currency = currency;
        this.emailAddress = emailAddress;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
