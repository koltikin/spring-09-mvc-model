package com.cydeo.controller;
import com.cydeo.bootStrap.DataGenerate;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
public class MentorController {
    private DataGenerate dataGenerate;

    @RequestMapping("/mentor")
    public String getMentors(Model model){

        var mentorList = dataGenerate.getMentorList(2);

        model.addAttribute("mentorList",mentorList);
//        model.addAttribute(mentorList); // we can add like this without attributeName;

        return "mentors/mentor"; //must not write '.html' -> "mentors/mentor.html"

    }
}
