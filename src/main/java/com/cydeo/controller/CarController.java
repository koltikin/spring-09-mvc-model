package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

    @RequestMapping("carInfo")
    public String carInfo(@RequestParam String make, Model model){
        model.addAttribute("make",make);


        return "car/car-info";
    }

    @RequestMapping("carInfo2")
    public String carInfo2(@RequestParam(value = "make",required = false,defaultValue = "Kia") String make, Model model){
        model.addAttribute("make",make);


        return "car/car-info";
    }

    @RequestMapping("carInfo3")
    public String carInfo3(@RequestParam String make,@RequestParam int year, Model model){
        model.addAttribute("make",make);
        model.addAttribute("year",year);


        return "car/car-info";
    }
    
    
    @RequestMapping("/info/{name}/{age}")
    public String getCarInfo(@PathVariable String name,@PathVariable int age, Model model){
        
        model.addAttribute(name);
        model.addAttribute(age);

        return "car/car-info"; 
    }


}
