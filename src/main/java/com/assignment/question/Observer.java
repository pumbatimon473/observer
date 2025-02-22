package com.assignment.question;

/*
 * Part 1: Define the Observer interface - the common action that will be performed by each observer
 * in the event of state change of the subject
 */
public interface Observer {
    void sendNotification(String stockName, double price);
}