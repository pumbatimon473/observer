package com.assignment.question.services;

import com.assignment.question.utils.NotificationUtils;

public class PressureService {
    public void trigger(double value) {
        NotificationUtils.sendNotification("New value is " + value);
    }
}