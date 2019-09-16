package com.dasuni.encap;

public class Bus {

    private String color;

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
