package com.hamzakh.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteWeatherStation implements WeatherStation {
    private float temperature;
    private float humidity;
    private float pressure;
    private List<WeatherDisplay> observers = new ArrayList<>();

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void addObserver(WeatherDisplay observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherDisplay observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (WeatherDisplay observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
}
