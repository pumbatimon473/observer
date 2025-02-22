package com.assignment.question.services;

import com.assignment.question.utils.NotificationUtils;

public class EmailService {
    public void sendEmail(Long id, Long taskId) {
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtils.sendEmail(subject, String.format(message, taskId, id));
    }
}