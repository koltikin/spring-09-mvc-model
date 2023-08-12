package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class StudentController {
    @RequestMapping("welcome")
    public String homePage(Model model){
        String name = "ziya";

        model.addAttribute("name","cydeo");
        model.addAttribute("course","MVC");

        String userName = "ziya";
        int studentId = new Random().nextInt();
        List<Integer> numbers = Arrays.asList(54,48,52,45,78,12);
        Student student = new Student(101,"ziya","kasgari");

        model.addAttribute("userName",userName);
        model.addAttribute("studentId",studentId);
        model.addAttribute("numbers",numbers);
        model.addAttribute("student",student);

        return "student/welcome";//must not write '.html' -> "student/welcome.html"
    }
}
