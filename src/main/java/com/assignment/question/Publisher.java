package com.assignment.question;

import java.util.ArrayList;
import java.util.List;

// Part 3: Define Subject interface
public abstract class Publisher implements ObserverRegistry {
    private List<Observer> ovservers;

    // CTOR
    public Publisher() {
        this.ovservers = new ArrayList<>();
    }

    public abstract void assignTask(Long taskId, Long userId);

    @Override
    public void addObserver(Observer observer) {
        this.ovservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.ovservers.remove(observer);
    }

    @Override
    public void notifyObservers(Long taskId, Long userId) {
        for (Observer observer : this.ovservers)
            observer.notifyUser(userId, taskId);
    }
}