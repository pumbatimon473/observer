package com.assignment.question;

import java.util.ArrayList;
import java.util.List;

// Part 3: Define Subject interface
public abstract class Publisher implements ObserverRegistry {    
    private List<Observer> observers;

    // CTOR
    public Publisher() {
        this.observers = new ArrayList<>();
    }

    public abstract void updateWeatherConditions(Double temperature, Double humidity, Double pressure);

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(double value) {
        for (Observer observer : this.observers)
            observer.triggerAlert(value);
    }
}