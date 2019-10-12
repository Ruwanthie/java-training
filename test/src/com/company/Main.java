package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Dasuni");
        studentNames.add("Chee");
        studentNames.add("Hasanthi");
        studentNames.add("Limesha");
        studentNames.add("Sajina");
        studentNames.add("Thara");
        studentNames.add("Mahesh");
        studentNames.add("Arjun");
        studentNames.add("Shantha");
        studentNames.add("Pramod");

        System.out.println("Before Sort");
        System.out.println(studentNames);

        Collections.sort(studentNames);
        System.out.println("After Sort");
        System.out.println(studentNames);

    }
}
