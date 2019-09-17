package com.dasuni.encap.levelone;

public class Application {
    public static void main(String[] args) {
        for (Student student:StudentAssistant.students){

            System.out.println(student); //when calling the toString method
        }
    }
}
