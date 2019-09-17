package com.dasuni.encap.levelone;

import java.util.ArrayList;

public class StudentAssistant {
    public static ArrayList<Student> students;

    static {
        students = new ArrayList<>();
        students.add(new Student("A"));
        students.add(new Student("B"));
        students.add(new Student("C"));

    }
}
