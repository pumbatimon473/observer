package com.assignment.question.services;

import com.assignment.question.Observer;
import com.assignment.question.utils.NotificationUtils;

// Part 2.2: Implement Observer interface - Concrete Observer
public class PressureService implements Observer {
    public void trigger(double value) {
        NotificationUtils.sendNotification("New value is " + value);
    }

    @Override
    public void triggerAlert(double value) {
        NotificationUtils.sendNotification("New value is " + value);
    }
}