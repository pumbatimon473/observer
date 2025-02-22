package com.assignment.question.services;

import com.assignment.question.utils.NotificationUtils;

public class AppService {
    public void sendPush(Long id, Long taskId) {
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtils.sendPush(subject, String.format(message, taskId, id));
    }
}