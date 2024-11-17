package org.example;

public class AirConditioner {

    int temperature;

    public void setTemperature(int temperature){

        this.temperature = temperature;
    }

    public void turnOnAC(){
        System.out.println("AC ON");
    }

    public void turnOFFAC(){
        System.out.println("AC OFF");
    }

}
