package com.cydeo.controller;
import com.cydeo.bootStrap.DataGenerate;
import com.cydeo.config.myFaker;
import com.cydeo.config.myRandom;
import com.cydeo.model.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MentorController {
    private DataGenerate dataGenerate;
    public MentorController(DataGenerate dataGenerate) {
        this.dataGenerate = dataGenerate;
    }

    @RequestMapping("/mentor")
    public String getMentors(Model model){

        var mentorList = dataGenerate.getMentorList(200);

        model.addAttribute("mentorList",mentorList);
//        model.addAttribute(mentorList); // we can add like this without attributeName;

        return "mentors/mentor"; //must not write '.html' -> "mentors/mentor.html"

    }
}
