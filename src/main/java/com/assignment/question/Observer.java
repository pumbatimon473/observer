package com.assignment.question;

/*
 * Part 1: Define the common action that will be performed by each observer
 * in the event of state update of the subject
 */
public interface Observer {
    void notifyUser(Long userId, Long taskId);
}