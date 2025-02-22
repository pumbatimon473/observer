package com.assignment.question;

import com.assignment.question.services.HumidityService;
import com.assignment.question.services.PressureService;
import com.assignment.question.services.TemperatureService;

public class WeatherMonitoringApplication {

    private double temperature;
    private double humidity;
    private double pressure;
    private double temperatureThreshold;
    private double humidityThreshold;
    private double pressureThreshold;

    private TemperatureService temperatureService = new TemperatureService();
    private HumidityService humidityService = new HumidityService();
    private PressureService pressureService = new PressureService();

    // DO NOT MODIFY THIS CONSTRUCTOR
    public WeatherMonitoringApplication(double initialTemperature, double initialHumidity, double initialPressure,
                                        double temperatureThreshold, double humidityThreshold, double pressureThreshold) {
        this.temperature = initialTemperature;
        this.humidity = initialHumidity;
        this.pressure = initialPressure;
        this.temperatureThreshold = temperatureThreshold;
        this.humidityThreshold = humidityThreshold;
        this.pressureThreshold = pressureThreshold;
    }
    // DO NOT MODIFY THIS CONSTRUCTOR

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
}