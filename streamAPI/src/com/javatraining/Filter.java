package com.javatraining;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        printStudentsWithShortnames();
        filterWithStream();
        process();
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
}
