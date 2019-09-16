package com.dasuni.encap;

public class Application {
    public static void main(String[] args) {
        for (Bus bus:BusStation.buses){
            //System.out.println(bus.getColor());
            System.out.println(bus); //when calling the toString method
        }
    }
}
