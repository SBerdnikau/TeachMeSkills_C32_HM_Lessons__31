package com.teachmeskills.lessons_31.task3;

import com.teachmeskills.lessons_31.task3.model.observerImpl.CurrentConditionDisplay;
import com.teachmeskills.lessons_31.task3.model.subjectImpl.WaterDate;

/**
 * 3. To analyze and implement a behavioral pattern that was not studied in class.
 * The Observer design pattern allows an object (subject) to notify other objects
 * (observers) about changes in its state.
 */
public class Main {
    public static void main(String[] args) {
        WaterDate waterDate = new WaterDate();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(waterDate);

        waterDate.setMeasurement(5, 70);
        waterDate.setMeasurement(8, 90);
        waterDate.setMeasurement(3, 80);
    }
}
