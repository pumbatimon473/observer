package com.assignment.question.services;

import com.assignment.question.Observer;
import com.assignment.question.utils.NotificationUtils;

// Part 2.1: Implement Observer interface - Concrete Observer 
public class AppService implements Observer {
    public void sendPush(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendPush(subject, message);
    }

    @Override
    public void sendNotification(String stockName, double price) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + price;
        NotificationUtils.sendPush(subject, message);
    }
}