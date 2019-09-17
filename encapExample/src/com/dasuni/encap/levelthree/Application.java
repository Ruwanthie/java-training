package com.dasuni.encap.levelthree;

//Third level encapsulation
public class Application {
    public static void main(String[] args) {
        StudentAssistant studentAssistant = new StudentAssistant();
        studentAssistant.addStudent(studentAssistant.new Student("A"));
        studentAssistant.addStudent(new StudentAssistant().new Student("B"));
        studentAssistant.getStudents();
    }
}
