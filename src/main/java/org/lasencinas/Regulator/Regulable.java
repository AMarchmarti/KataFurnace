package org.lasencinas.Regulator;

public interface Regulable {

    void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, RoomTemperature temperature);
    void message(RegulatorDisplayCodes code, RoomTemperature temperature);
}
