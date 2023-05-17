package Lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {

        Student student1 = new Student("Михаил", Course.ADMINISTRATION);
        Student student2 = new Student("Михаил", Course.DESIGN);
        Student student3 = new Student("Михаил", Course.MATHEMATICS);
        Student student4 = new Student("Иван", Course.PHYSICS);
        Student student5 = new Student("Иван", Course.PROGRAMMING);
        Student student6 = new Student("Николай", Course.TESTING);
        Student student7 = new Student("Николай", Course.PROGRAMMING);
        Student student8 = new Student("Константин", Course.TESTING);
        Student student9 = new Student("Екатерина", Course.ADMINISTRATION);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);

        System.out.println("Task 1");
        List<Course> unicCourse = students.stream()
                .map((student -> student.getCourse()))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unicCourse);

        System.out.println("Task 2");
        List<String> studentsCurious = students.stream()
                .sorted((s1, s2) -> student1.getCourse().compareTo(student2.getCourse()))
                .map((student -> student.getName()))
                .collect(Collectors.toList());
        System.out.println(studentsCurious);

        System.out.println("Task 3");
        List<String> studentsOnCourse = students.stream()
                .filter(student -> student.getCourse() == Course.TESTING)
                .map((student -> student.getName()))
                .collect(Collectors.toList());
        System.out.println(studentsOnCourse);

    }
}}
