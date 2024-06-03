package com.hamzakh.behavioral.observer;

public interface WeatherStation {
    void addObserver(WeatherDisplay observer);
    void removeObserver(WeatherDisplay observer);
    void notifyObservers();
    void setMeasurements(float temperature, float humidity, float pressure); // Added declaration
}


