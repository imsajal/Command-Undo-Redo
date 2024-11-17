package org.example;


public class Main {
    public static void main(String[] args) {

     AirConditioner airConditioner = new AirConditioner();

     Command turnAcOnCommand = new TurnAcOnCommand(airConditioner);
     Command turnOffCommand = new TurnAcOffCommand(airConditioner);

     Remote remote = new Remote(1);
     remote.setCommand(0, turnAcOnCommand, turnOffCommand);
     remote.pressOnButton(0);
     remote.pressOffButton(0);
     remote.undo();
     remote.redo();
     remote.pressOffButton(0);
     remote.undo();
     remote.redo();
    }
}