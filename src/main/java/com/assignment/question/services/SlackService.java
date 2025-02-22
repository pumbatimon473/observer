package com.assignment.question.services;

import com.assignment.question.utils.NotificationUtils;

public class SlackService {
    public void sendSlack(Long id, Long taskId) {
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtils.sendSlack(subject, String.format(message, taskId, id));
    }
}