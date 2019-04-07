package org.lasencinas.Heater;

import org.lasencinas.Temperature.Instance;

public interface Heatable {

    void engage(Instance temperature);
    void disengage(Instance temperature);
}
