package kz.springboot.springbootdemo.controllers;
import kz.springboot.springbootdemo.DB.DB_Manager;
import kz.springboot.springbootdemo.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class HomeController {
    @GetMapping ("/")
    public String index(Model model){
        ArrayList<Student> students =DB_Manager.getStudents();
        model.addAttribute("studentter", students);
        return "index";
    }
    @PostMapping(value = "/add-student")
    public String addStudent(Student student) {
        if (student.getExam() >= 90) {
            student.setMark("A");
        } else if (student.getExam() >= 75){
            student.setMark("B");
        } else if (student.getExam() >= 60){
            student.setMark("C");
        }else if (student.getExam() >= 50){
            student.setMark("D");
        }else {
            student.setMark("F");
        }
        DB_Manager.addStudent(student);
        return "redirect:/";
    }
    @GetMapping(value = "/add-student")
    public String addStudentPage (Model model){
        return "addStudent";
    }

}
