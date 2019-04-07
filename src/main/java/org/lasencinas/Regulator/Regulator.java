package org.lasencinas.Regulator;

import org.lasencinas.Heater.Heatable;
import org.lasencinas.Temperature.Instance;
import org.lasencinas.Temperature.Temperable;

public class Regulator implements Regulable{

    public void regulate(Temperable t, Heatable h, double minTemp, double maxTemp, Instance temperature) {
        RegulatorCode code;
        while (t.read(temperature) < maxTemp) {
            code = RegulatorCode.WARMINGUP;
            h.engage(temperature);
            message(code, temperature);
        }
        while (t.read(temperature) > minTemp) {
            code = RegulatorCode.COOLING;
            h.disengage(temperature);
            message(code, temperature);
        }
    }

    public void message(RegulatorCode code, Instance temperature) {
        switch (code) {
            case WARMINGUP:
                System.out.println("Calentando => temperatura " + temperature.getTemperature());
                break;
            case COOLING:
                System.out.println("Apagado => temperatura " + temperature.getTemperature());
                break;
            default:
                System.out.println("Algo raro sucede...");
                break;
        }
    }
}
