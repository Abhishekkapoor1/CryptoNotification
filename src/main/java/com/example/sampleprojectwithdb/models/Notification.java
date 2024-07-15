package com.example.sampleprojectwithdb.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Notification {
    @GeneratedValue
    @Id
    int id;
    Currency currency;
    double price;
    double highPrice;
    long volume;
    long marketCap;

    public Notification() {
    }

    public Notification(Currency name, double price, double highPrice, long volume, long marketCap) {
        this.currency = name;
        this.price = price;
        this.highPrice = highPrice;
        this.volume = volume;
        this.marketCap = marketCap;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(double highPrice) {
        this.highPrice = highPrice;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }
}
