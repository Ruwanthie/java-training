package com.dasuni.encaphigherlevel;


public class Application {
    public static void main(String[] args) {

     //  BusStation.Bus buses = new BusStation().new Bus(); // Creating objects from a member class - second level encapsulation
        BusStation busStation = new BusStation();
        busStation.addBus("Green"); //Calling String method

        // Whenever we gain the access to the BusStation we can get the Bus instance either way
        busStation.addBus(busStation.new Bus("red"));
        busStation.addBus(new BusStation().new Bus("Blue"));


        busStation.getBuses();
    }
}
