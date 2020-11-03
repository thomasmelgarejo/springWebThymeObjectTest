package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RadioButtonController
{

    @GetMapping("/radiobutton")
    public String radiobuttons(@ModelAttribute("person")Person person)
    {
        return "radiobutton";
    }

    @PostMapping("/radiobutton")
    public String radiobuttonfecth(@ModelAttribute("person")Person person, Model model)
    {
        System.out.println("Printer title: "+person.getTitel());
        //System.out.println("Hejsa");
        return "radiobutton";
    }


}
