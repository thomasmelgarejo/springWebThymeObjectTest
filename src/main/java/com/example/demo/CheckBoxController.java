package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class CheckBoxController
{
    @GetMapping("/checkbox")
    public String chekBox(Model model) //@ModelAttribute("person") Person person)
    {
        Person person = new Person();
        model.addAttribute("person", person);


        return "checkbox";
    }

}
