package com.dasuni.encap.levelone;

//first level encapsulation
// private attributes + public methods
public class Student {
    private String grade;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade='" + grade + '\'' +
                '}';
    }
}
