package org.lasencinas.Heater;

import org.lasencinas.Temperature.Instance;

public class ContactTaser implements Heatable{

        //Attributes
        private final Double AMPERE = 0.001;
        private final Integer RESISTANCE = 1000000;
        private final Integer CALORIFICCOFICIENT = 1;
        private Integer time ;
        private Double electricity = 0d;
        private Double mass ;

        //Constructor
        public ContactTaser(Integer time, Double mass){
            this.time = time;
            this.mass = mass;
        }

        //Setters
        public void setElectricity (Integer time){
            this.electricity = Math.pow(AMPERE, 2) * RESISTANCE * time;
        }


        //Getters
        public Integer getTime(){
            return this.time;
        }

        public Double getMass() {
            return mass;
        }

        public Double getElectricity() {
                return electricity;
            }

        public Double getHot(){
            return getElectricity() / (getMass() * CALORIFICCOFICIENT );
        }

    // Logic

        public void engage(Instance temperature) {
            int i = 0;
            while (i <= getTime()){
                setElectricity(i);
                temperature.incrementTemperature(getHot());
                i += 1;
            }
        }

        public void disengage(Instance temperature) {
            temperature.incrementTemperature(-1.0);
        }

}
