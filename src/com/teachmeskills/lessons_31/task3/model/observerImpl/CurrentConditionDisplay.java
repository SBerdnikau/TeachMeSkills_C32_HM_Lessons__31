package com.teachmeskills.lessons_31.task3.model.observerImpl;

import com.teachmeskills.lessons_31.task3.model.Observer;
import com.teachmeskills.lessons_31.task3.model.Subject;

/**
 * Implements the Observer interface. It receives updates from WeatherData and displays
 * current conditions.
 */
public class CurrentConditionDisplay implements Observer {

    private int temperature;
    private int humidity;
    private Subject waterDate;

    public CurrentConditionDisplay(Subject waterDate) {
        this.waterDate = waterDate;
        waterDate.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current temperature: " + temperature + " C, " + humidity + "% humidity");
    }
}
