package com.teachmeskills.lessons_31.task2;

import com.teachmeskills.lessons_31.task2.model.Command;
import com.teachmeskills.lessons_31.task2.model.RemoteControl;
import com.teachmeskills.lessons_31.task2.model.commandImpl.fanCommand.FanOffCommand;
import com.teachmeskills.lessons_31.task2.model.commandImpl.fanCommand.FanOnCommand;
import com.teachmeskills.lessons_31.task2.model.commandImpl.lightCommand.LightOffCommand;
import com.teachmeskills.lessons_31.task2.model.commandImpl.lightCommand.LightOnCommand;
import com.teachmeskills.lessons_31.task2.model.fan.Fan;
import com.teachmeskills.lessons_31.task2.model.light.Light;

/**
 2. It is necessary to develop a program that uses the design pattern "Command"
 to control some actions in the "Smart Home" system.
 As an example, we can consider the control of devices such as lights, fans or other household appliances.
 */
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command fanOn = new FanOnCommand(fan);
        Command fanOff = new FanOffCommand(fan);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();

        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();

        remoteControl.setCommand(fanOn);
        remoteControl.pressButton();

        remoteControl.setCommand(fanOff);
        remoteControl.pressButton();
    }
}
