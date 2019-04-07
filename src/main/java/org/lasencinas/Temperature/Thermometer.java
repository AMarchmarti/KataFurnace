package org.lasencinas.Temperature;

public class Thermometer implements Temperable {

    public Double read (Instance room){
        return room.getTemperature();
    }
}
