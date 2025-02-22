package com.assignment.question.services;

import com.assignment.question.Observer;
import com.assignment.question.utils.NotificationUtils;

// Part 2.3: Implement Observer interface - Concrete Observer
public class SlackService implements Observer {
    private static final String SUBJECT = "New task assigned";
    private static final String MESSAGE_FORMAT = "Task %s assigned to user %s";

    /*
    public void sendSlack(Long id, Long taskId) {
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtils.sendSlack(subject, String.format(message, taskId, id));
    }
    */

    @Override
    public void notifyUser(Long userId, Long taskId) {
        NotificationUtils.sendSlack(SUBJECT, String.format(MESSAGE_FORMAT, taskId, userId));
    }


}