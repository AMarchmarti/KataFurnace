package org.lasencinas.Heater;

public class Heater implements Heatable {

    public void engage(RoomTemperature temperature){
        temperature.incrementTemperature(1);
    }

    public void disengage(RoomTemperature temperature){
        temperature.incrementTemperature(-1);
    }
}
