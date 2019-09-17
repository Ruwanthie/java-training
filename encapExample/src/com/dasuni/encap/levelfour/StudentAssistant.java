package com.dasuni.encap.levelfour;

import java.util.ArrayList;

public class StudentAssistant {

    private ArrayList<Student> students = new ArrayList<>();

    public void getStudents() {
        for(Student student:students){
            validate(student.getGrade());
            System.out.println(student.getGrade());
        }
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    //Fourth level encapsulation
    //nested object inside the method in a class
    public void validate(String grade){
        new Object(){
            public void Validate() {
                if ("A".equalsIgnoreCase(grade)) {
                    System.out.println("Pass");
                } else {
                    System.out.println("Fail");
                }
            }
        }.Validate();

    }
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
