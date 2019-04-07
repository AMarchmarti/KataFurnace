package org.lasencinas.Regulator;

import org.lasencinas.Heater.Heatable;
import org.lasencinas.Temperature.Instance;
import org.lasencinas.Temperature.Temperable;

public interface Regulable {

    void regulate(Temperable t, Heatable h, double minTemp, double maxTemp, Instance temperature);
    void message(RegulatorCode code, Instance temperature);
}
