package com.teachmeskills.lessons_31.task2.model.commandImpl.fanCommand;

import com.teachmeskills.lessons_31.task2.model.Command;
import com.teachmeskills.lessons_31.task2.model.fan.Fan;

public class FanOffCommand implements Command {
    private Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOff();
    }
}
