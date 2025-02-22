package com.assignment.question.services;

import com.assignment.question.Observer;
import com.assignment.question.utils.NotificationUtils;

// Part 2.2: Implement Observer interface - Concrete Observer
public class EmailService implements Observer {
    public void sendEmail(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendEmail(subject, message);
    }

    @Override
    public void sendNotification(String stockName, double price) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + price;
        NotificationUtils.sendEmail(subject, message);
    }
}