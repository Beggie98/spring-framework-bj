package dono.daryo.controller;


import dono.daryo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","Daryo");
        model.addAttribute("course","MVC");

        String subject = "Collections";
        model.addAttribute("subject",subject);

        //create random studentId(0-1000) and show it in the UI

        int studentId = new Random().nextInt();
        model.addAttribute("studentId",studentId);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);
        model.addAttribute("numbers",numbers);


        Student student = new Student(1,"Mike","Smith");
        model.addAttribute("student",student);

        return "student/welcome";
    }



}
