package org.example;

public class TurnAcOnCommand implements Command{

    private AirConditioner airConditioner;

    public TurnAcOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {

        airConditioner.turnOnAC();

    }

    @Override
    public void undo() {
        System.out.println("Undo command - turn off ac");
    }

}
