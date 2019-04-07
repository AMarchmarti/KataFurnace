package org.lasencinas.Temperature;

public class Instance {

        /*
        We will use the Singleton pattern for this project, since we want the Instance to be unique
        and we want a global access point to it.

        The Singleton Pattern requires:
            - Static variable that stores a reference to the object
            - Private Constructor
            - A method that creates an instance of the object if it does not exist
         */

        //Attributes

        private Double temperature = 0d;
        private static Instance ROOM = null;

        //Constructor (Private)

        private Instance (Double temp){
            this.temperature = temp;
        }


        //Getters

        public static Instance getInstance(Double temperature){
            if (ROOM == null){
                ROOM = new Instance(temperature);
            }

            return ROOM;
        }

        public Double getTemperature(){
            return this.temperature;
        }

        public void incrementTemperature(Double change){
            this.temperature += change;
        }
}
