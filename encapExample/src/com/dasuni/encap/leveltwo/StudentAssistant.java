package com.dasuni.encap.leveltwo;

import com.dasuni.encap.levelone.Student;

import java.util.ArrayList;

public class StudentAssistant {

    private ArrayList<Student> students = new ArrayList<>();

    public void getStudents() {
        for(Student student:students){
            System.out.println(student.getGrade());
        }
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    //Member class
    //Second level encapsulation
    //Member class or a nested class inside a class
    class Student {
        private String grade;

        public Student() {
        }

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


}
