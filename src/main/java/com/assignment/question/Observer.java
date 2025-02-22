package com.assignment.question;

/*
 * Part 1: Define Observer interface - common action that will be triggered in the event of state change of the subject
 */
public interface Observer {
    void triggerAlert(double value);
}