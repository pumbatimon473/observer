package com.assignment.question;

import com.assignment.question.services.HumidityService;
import com.assignment.question.services.PressureService;
import com.assignment.question.services.TemperatureService;

// Part 4: Implement Subject interface - Concrete Subject
public class WeatherMonitoringApplication extends Publisher {

    private double temperature;
    private double humidity;
    private double pressure;
    private double temperatureThreshold;
    private double humidityThreshold;
    private double pressureThreshold;

    // private TemperatureService temperatureService = new TemperatureService();
    // private HumidityService humidityService = new HumidityService();
    // private PressureService pressureService = new PressureService();

    // DO NOT MODIFY THIS CONSTRUCTOR
    public WeatherMonitoringApplication(double initialTemperature, double initialHumidity, double initialPressure,
                                        double temperatureThreshold, double humidityThreshold, double pressureThreshold) {
        super();
        this.temperature = initialTemperature;
        this.humidity = initialHumidity;
        this.pressure = initialPressure;
        this.temperatureThreshold = temperatureThreshold;
        this.humidityThreshold = humidityThreshold;
        this.pressureThreshold = pressureThreshold;
    }
    // DO NOT MODIFY THIS CONSTRUCTOR

    /* Old Method
    public void updateWeatherConditions(double newTemperature, double newHumidity, double newPressure) {
        temperature = newTemperature;
        humidity = newHumidity;
        pressure = newPressure;

        if (temperature > temperatureThreshold) {
            temperatureService.trigger(temperature);
        }

        if (humidity > humidityThreshold) {
            humidityService.trigger(humidity);
        }

        if (pressure > pressureThreshold) {
            pressureService.trigger(pressure);
        }
    }
    */

    @Override
    public void updateWeatherConditions(Double temperature, Double humidity, Double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        // Notify all of the observers if any of the parameters crosses its respective threshold
        if (this.temperature > this.temperatureThreshold)
            this.notifyObservers(temperature);
        
        if (this.humidity > this.humidityThreshold)
            this.notifyObservers(humidity);
        
        if (this.pressure > this.pressureThreshold)
            this.notifyObservers(pressure);
    }
}