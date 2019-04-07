package org.lasencinas.Aplication;

import org.lasencinas.Heater.Heatable;
import org.lasencinas.Heater.Heater;
import org.lasencinas.Regulator.Regulable;
import org.lasencinas.Regulator.Regulator;
import org.lasencinas.Temperature.Instance;
import org.lasencinas.Temperature.Temperable;
import org.lasencinas.Temperature.Thermometer;

/**
 * Hello world!
 *
 */
public class  App {
    public static void main(String[] args) {


        final double minTemp = 15.0;
        final double maxTemp = 21.0;

        Instance temperature = Instance.getInstance(15.0);
        Heatable heater = new Heater();
        Temperable thermometer = new Thermometer();

        Regulable regulator = new Regulator();

        System.out.println("Arrancando..." );
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);
/*
    Jedi yoda = new Jedi();
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature);
        yoda.speak();*/
    }
}


