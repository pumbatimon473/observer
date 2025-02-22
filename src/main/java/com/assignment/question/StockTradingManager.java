package com.assignment.question;

import com.assignment.question.services.AppService;
import com.assignment.question.services.EmailService;
import com.assignment.question.services.SmsService;

public class StockTradingManager {

    private String stockName;
    private double currentPrice;
    private double notificationThreshold;
    private EmailService emailService = new EmailService();

    private SmsService smsService = new SmsService();
    private AppService appService = new AppService();

    // DO NOT MODIFY THIS CONSTRUCTOR
    public StockTradingManager(String stockName, double initialPrice, double notificationThreshold) {
        this.stockName = stockName;
        this.currentPrice = initialPrice;
        this.notificationThreshold = notificationThreshold;
    }
    // DO NOT MODIFY THIS CONSTRUCTOR

    public void updateStockPrice(double newPrice) {
        currentPrice = newPrice;
        if (currentPrice > notificationThreshold) {
            emailService.sendEmail(stockName, currentPrice);
            smsService.sendSMS(stockName, currentPrice);
            appService.sendPush(stockName, currentPrice);
        }
    }

}