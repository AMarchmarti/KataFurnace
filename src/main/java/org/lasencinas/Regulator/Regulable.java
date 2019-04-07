package org.lasencinas.Regulator;

import org.lasencinas.Heater.Heater;
import org.lasencinas.Temperature.Instance;
import org.lasencinas.Temperature.Temperable;

public interface Regulable {

    void regulate(Temperable t, Heater h, double minTemp, double maxTemp, Instance temperature);
    void message(RegulatorDisplayCodes code, Instance temperature);
}
