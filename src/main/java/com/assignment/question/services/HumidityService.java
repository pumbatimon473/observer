package com.assignment.question.services;

import com.assignment.question.utils.NotificationUtils;

public class HumidityService {
    public void trigger(double value) {
        NotificationUtils.sendNotification("New value is " + value);
    }
}