package com.teachmeskills.lessons_31.task3.model.subjectImpl;

import com.teachmeskills.lessons_31.task3.model.Observer;
import com.teachmeskills.lessons_31.task3.model.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * It keeps a list of observers and notifies them when the state changes
 * (in this case, temperature and humidity).
 */
public class WaterDate implements Subject {

    private int temperature;
    private int humidity;
    private List<Observer> observers;

    public WaterDate() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity);
        }
    }

    public void setMeasurement(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
}
