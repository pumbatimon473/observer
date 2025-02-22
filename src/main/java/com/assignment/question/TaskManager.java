package com.assignment.question;

import com.assignment.question.services.AppService;
import com.assignment.question.services.EmailService;
import com.assignment.question.services.SlackService;

// Part 4: Implement Subject interface - Concrete Subject
public class TaskManager extends Publisher {
    /* Old Code Block
    private EmailService emailService = new EmailService();
    private SlackService slackService = new SlackService();
    private AppService appService = new AppService();


    public void assignTask(Long taskId, Long userId) {
        emailService.sendEmail(userId, taskId);
        slackService.sendSlack(userId, taskId);
        appService.sendPush(userId, taskId);

    }
    */

    // CTOR
    public TaskManager() {
        super();
    }

    @Override
    public void assignTask(Long taskId, Long userId) {
        // Event: New Task
        this.notifyObservers(taskId, userId);
    }
}