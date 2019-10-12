package com.company;

import java.util.*;

public class Student implements Comparable {
    private  String name;
    private  String city;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, String city, int id) {
        this.name = name;
        this.city = city;
        this.id = id;
    }

    public  static List<Student> getStudent(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Raj", "Pettah", 9));
        students.add(new Student("Thara", "Kohuwela", 10));
        students.add(new Student("Krish", "Kadawatha", 1));
        students.add(new Student("Krish", "Kadawatha", 1));
        students.add(new Student("Krish", "Kadawatha", 1));
        students.add(new Student("Yamuna", "Matara", 7));
        students.add(new Student("Sameer", "Hatton", 8));
        students.add(new Student("Hasanthi", "Galle", 4));
        students.add(new Student("Sajina", "Jaffna", 5));
        students.add(new Student("Shantha", "Ratnapura", 6));

        return students;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() &&
                Objects.equals(getName(), student.getName()) &&
                Objects.equals(getCity(), student.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCity(), getId());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city="+city+
                '}';
    }


    public int compareTo(Student o) {
        return this.getCity().compareTo(o.getCity());
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}