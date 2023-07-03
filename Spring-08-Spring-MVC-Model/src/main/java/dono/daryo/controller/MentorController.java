package dono.daryo.controller;

import dono.daryo.enums.Gender;
import dono.daryo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @RequestMapping("/list")
    public String showTable(Model model){

        List<Mentor> mentors = new ArrayList<>();
        mentors.add(new Mentor("Mike","Smith",45, Gender.Male));
        mentors.add(new Mentor("Tom","Hanks",65, Gender.Male));
        mentors.add(new Mentor("Ammy","Bryan",25, Gender.Female));

        model.addAttribute("mentors",mentors);

        return "mentor/mentor-list";
    }

}
