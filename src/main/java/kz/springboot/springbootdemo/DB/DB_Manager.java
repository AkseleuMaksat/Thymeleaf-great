package kz.springboot.springbootdemo.DB;


import kz.springboot.springbootdemo.entity.Student;

import java.util.ArrayList;

public class DB_Manager {
    private static ArrayList<Student> students = new ArrayList<>();
    private static  long id = 8L;
    static {
        students.add(new Student(1L, "akseleu", "maksat", 88,"B"));
        students.add(new Student(2L, "aksele", "maksa", 90,"A"));
        students.add(new Student(3L, "ak", "maksat", 88,"B"));
        students.add(new Student(4L, "akseleu", "maksat", 88,"B"));
        students.add(new Student(5L, "aksleu", "mksat", 50,"D"));
        students.add(new Student(6L, "kseleu", "masat", 88,"B"));
        students.add(new Student(7L, "aksleu", "maksat", 49,"F"));
    }
    public static ArrayList<Student> getStudents(){
        return students;
    }
    public static void  addStudent(Student student){
        student.setId(id);
        id++;
        students.add(student);
    }

}
