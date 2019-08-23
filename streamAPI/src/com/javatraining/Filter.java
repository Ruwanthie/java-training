package com.javatraining;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        printStudentsWithShortnames();
        filterWithStream();
        process();
        streamMinObject();
        streamMaxObject();
        streamCountObjects();
    }

    //Stream API - Processing function C(original) = C(result)
    static void process(){
        Student.getStudents().stream().map(s->new Student("Dr "+s.getName(), s.getId())).collect(Collectors.toList()).forEach(s-> {
            System.out.println(s.getName()+" "+s.getId());

        /**    List<Student> students = Student.getStudents().stream().map(s->new Student("Dr "+s.getName(), s.getId())).collect(Collectors.toList());
         *     System.out.println(students);
        **/
        });
    }

    //Stream API - Filtering function C(original) > = C(result)
    static void filterWithStream(){
        List<Student> students = Student.getStudents().stream().filter(s->s.getName().length()<=6).collect(Collectors.toList());
        System.out.println(students);
    }

    //function to print student names
    static void printStudentsWithShortnames(){
        List<Student> students = Student.getStudents();
        for(Student student:students){
            if(student.getName().length()<=6){
                System.out.println(student.getName());
            }
        }
    }

    static void streamMinObject(){
        List<Student> students = Student.getStudents();
        Comparator<Student> comparator = Comparator.comparing( Student::getId );
        // Get Min Object - filter by Id
        Student minObject = students.stream().min(comparator).get();
        System.out.println(minObject);
    }

    static void streamMaxObject(){
        List<Student> students = Student.getStudents();
        Comparator<Student> comparator = Comparator.comparing( Student::getId );
        // Get Max Object - filter by Id
        Student maxObject = students.stream().max(comparator).get();
        System.out.println(maxObject);
    }

    static void streamCountObjects(){
        List<Student> students = Student.getStudents();
        //Count number of Student objects in list
        long count = students.stream().count();
        System.out.println("No. of Students : "+count);
        //Count number of Student objects starting with letter 'S' in list
        count = students.stream().filter(s -> s.getName().startsWith("S")).count();
        System.out.println("No. of Student Names starting with letter 'S' : "+count);
    }
}
