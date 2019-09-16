package com.dasuni.encaphigherlevel;

import java.util.ArrayList;

public class BusStation {

    private ArrayList<Bus> buses = new ArrayList<>();

    //Since we have create the arraylist as private generate getters and setters
   /* public ArrayList<Bus> getBuses() {
        return buses;
    }*/
    public void getBuses() {
       for(Bus bus:buses){
           validate(bus.getColor());
           System.out.println(bus.getColor());
       }
    }

    public void setBuses(ArrayList<Bus> buses) {
        this.buses = buses;
    }

    public void addBus(Bus bus){
        buses.add(bus);
    }

    public void addBus(String color){
        buses.add(new Bus(color));
    }

    public BusStation() {
    }

    //Overriding the constructor to add the color of bus to the list
    public BusStation(String color) {
        buses.add(new Bus(color));
    }

//    //Third level encapsulation
//    public void validate(String color){
//        class BusValidator{
//            public void colorValidate() {
//                if ("red".equalsIgnoreCase(color)) {
//                    System.out.println("Valid");
//                } else {
//                    System.out.println("Invalid");
//                }
//            }
//        }
//        new BusValidator().colorValidate();
//
//    }

    //Fourth level encapsulation - without using class keyword directly invoke its parent - Object class (Anonymous class)
    //Anonymous class cannot be invoke
    //Fourth level encapsulation can be used to avoid invoking the inner method implemented in the class of super method at anyplace of the super method
    public void validate(String color){
        new Object(){
            public void colorValidate() {
                if ("red".equalsIgnoreCase(color)) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
            }
        }.colorValidate();

    }



    class Bus {

        private String color;

        public Bus() {
        }

        @Override
        public String toString() {
            return "Bus{" +
                    "color='" + color + '\'' +
                    '}';
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Bus(String color) {
            this.color = color;
        }
    }

}