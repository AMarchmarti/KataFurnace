package org.lasencinas.Regulator;

import org.lasencinas.Heater.Heater;
import org.lasencinas.Temperature.Instance;
import org.lasencinas.Temperature.Temperable;

public class Regulator implements Regulable{

    public void regulate(Temperable t, Heater h, double minTemp, double maxTemp, Instance temperature) {
        RegulatorDisplayCodes code;
        while (t.read(temperature) < maxTemp) {
            code = RegulatorDisplayCodes.HEATING;
            h.engage(temperature);
            message(code, temperature);
        }
        while (t.read(temperature) > minTemp) {
            code = RegulatorDisplayCodes.WAITING;
            h.disengage(temperature);
            message(code, temperature);
        }
    }

    private void message(RegulatorDisplayCodes code, Instance temperature) {
        switch (code) {
            case HEATING:
                System.out.println("Calentando => temperatura " + temperature.getTemperature());
                break;
            case WAITING:
                System.out.println("Apagado => temperatura " + temperature.getTemperature());
                break;
            default:
                System.out.println("Algo raro sucede...");
                break;
        }
    }
}
