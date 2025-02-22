package com.assignment.question.services;

import com.assignment.question.Observer;
import com.assignment.question.utils.NotificationUtils;

// Part 2.3: Implement Observer interface - Concrete Observer
public class SmsService implements Observer {
    public void sendSMS(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendSms(subject, message);
    }

    @Override
    public void sendNotification(String stockName, double price) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + price;
        NotificationUtils.sendSms(subject, message);
    }
}