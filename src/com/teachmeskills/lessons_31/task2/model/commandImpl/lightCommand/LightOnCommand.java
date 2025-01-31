package com.teachmeskills.lessons_31.task2.model.commandImpl.lightCommand;

import com.teachmeskills.lessons_31.task2.model.Command;
import com.teachmeskills.lessons_31.task2.model.light.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
