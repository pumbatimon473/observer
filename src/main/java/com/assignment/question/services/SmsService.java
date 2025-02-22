package com.assignment.question.services;

import com.assignment.question.utils.NotificationUtils;

public class SmsService {
    public void sendSMS(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendSms(subject, message);
    }
}