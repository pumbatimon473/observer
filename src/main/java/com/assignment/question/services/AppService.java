package com.assignment.question.services;

import com.assignment.question.utils.NotificationUtils;

public class AppService {
    public void sendPush(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendPush(subject, message);
    }
}