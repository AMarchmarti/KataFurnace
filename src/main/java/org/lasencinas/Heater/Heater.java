package org.lasencinas.Heater;

import org.lasencinas.Temperature.Instance;

public class Heater implements Heatable {

    public void engage(Instance temperature){
        temperature.incrementTemperature(1.0);
    }

    public void disengage(Instance temperature){
        temperature.incrementTemperature(-1.0);
    }
}
