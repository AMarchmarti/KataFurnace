package org.lasencinas.Heater;

import org.lasencinas.Temperature.Instance;

public class ContactTaser implements Heatable{

        //Attributes
        private final Integer VOLTAGE = 300000;
        private final Double AMPERE = 0.001;
        private final Integer RESISTANCE = 1000000;
        private Integer time = 0;

        //Constructor
        public ContactTaser(Integer time){
            this.time = time;
        }


        //Getters
        public Integer getTime(){
            return this.time;
        }

        // Logic

        public void engage(Instance temperature) {

        }

        public void disengage(Instance temperature) {

        }

        public Double electricity (){
            int i = 0;
            while (i <= getTime()){
                Double energy = Math.pow(AMPERE, 2) * RESISTANCE * i;
        }

}
