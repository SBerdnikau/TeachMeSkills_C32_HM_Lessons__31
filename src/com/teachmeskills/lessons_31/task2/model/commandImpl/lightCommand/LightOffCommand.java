package com.teachmeskills.lessons_31.task2.model.commandImpl.lightCommand;

import com.teachmeskills.lessons_31.task2.model.Command;
import com.teachmeskills.lessons_31.task2.model.light.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
