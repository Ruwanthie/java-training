package com.company;

import java.util.*;

public class TestStudent {
    public static void main(String[] args) {


        List<Student> list= Student.getStudent();

        System.out.println("Student List(Duplicate)");
        System.out.println(list);


        System.out.println("----------------------------------");
        System.out.println("Student List(Unique)");
        Set<Student> set=new HashSet<Student>(list);

        System.out.println(set);

    }
}
