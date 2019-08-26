package com.javatraining;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithLambda {
    public static void main(String[] args) {
        Comparator<Student> studentComparator = (s1,s2)->(s1.getId()<s2.getId()?-1:(s1.getId()>s2.getId()?1:0));
        List<Student> students = Student.getStudents();
        Collections.sort(students, studentComparator);
        System.out.println(students);
    }
}
