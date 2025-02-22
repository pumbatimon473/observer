package com.assignment.question.services;

import com.assignment.question.utils.NotificationUtils;

public class EmailService {
    public void sendEmail(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendEmail(subject, message);
    }
}