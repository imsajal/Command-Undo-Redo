package org.example;

public class TurnAcOffCommand implements  Command{

    private AirConditioner airConditioner;

    public TurnAcOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {

        airConditioner.turnOFFAC();

    }

    @Override
    public void undo() {
        System.out.println("Undo - turn on ac");
    }
}
