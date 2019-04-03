package org.lasencinas.Heater;

public interface Heatable {
    void engage(RoomTemperature temperature);
    void disengage(RoomTemperature temperature);
}
