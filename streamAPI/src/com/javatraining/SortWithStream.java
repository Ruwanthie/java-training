package com.javatraining;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortWithStream {

    public static void main(String[] args) {

        //Sort list with stream
        List<Student> students = Student.getStudents().stream().sorted(Comparator.comparing(Student::getId)).collect(Collectors.toList());
        System.out.println(students);

        //Sort list with stream & lambda exp together
        Student.getStudents().stream().sorted((s1,s2)->new Integer(s1.getId()).compareTo(s2.getId())).collect(Collectors.toList());
        System.out.println(students);

        //reverse sorting
        List<Student> studentlist = Student.getStudents().stream().sorted((s1,s2)->new Integer(-s1.getId()).compareTo(-s2.getId())).collect(Collectors.toList());
        System.out.println(studentlist);
    }
}
