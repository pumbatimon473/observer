package com.assignment.question;

import java.util.ArrayList;
import java.util.List;

// Part 3: Define the Subject interface
public abstract class Publisher implements ObserverRegistry {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String stockName, double currentPrice) {
        for (Observer observer : this.observers)
            observer.sendNotification(stockName, currentPrice);
    }
}