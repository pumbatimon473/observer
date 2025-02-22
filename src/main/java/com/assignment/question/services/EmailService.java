package com.assignment.question.services;

import com.assignment.question.Observer;
import com.assignment.question.utils.NotificationUtils;

// Part 2.2: Implement Observer interface - Concrete Observer
public class EmailService implements Observer {
    private static final String SUBJECT = "New task assigned";
    private static final String MESSAGE_FORMAT = "Task %s assigned to user %s";
    
    /*
    public void sendEmail(Long id, Long taskId) {
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtils.sendEmail(subject, String.format(message, taskId, id));
    }
    */

    @Override
    public void notifyUser(Long userId, Long taskId) {
        NotificationUtils.sendEmail(SUBJECT, String.format(MESSAGE_FORMAT, taskId, userId));
    }
}