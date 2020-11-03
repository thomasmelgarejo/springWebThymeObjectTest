package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class DropBoxController
{
    List<String> listTitler = Arrays.asList("Konge", "Prins", "Bonde");

    @GetMapping("/dropbox")
    public String dropBoxInsertValue(Model model, @ModelAttribute("person") Person person)
    {
        //Person person = new Person();
        model.addAttribute("person", person); //overføre model klasse

        //Indsætter værdier i dropbox muligheder
        //List<String> listTitler = Arrays.asList("Konge", "Prins", "Bonde");
        model.addAttribute("listTitler", listTitler); //overføre liste til dropbox


        return "dropbox";
    }


    @PostMapping("/dropbox") // "/dropbox" skal være det samme som i <form method="post" action="/dropbox" <---
    public String dropBoxFecthValue(@ModelAttribute("person") Person person, Model model)
    {
        //System.out.println("printer person "+person.getTitel());
        if (person.getTitel().equals("Konge"))
        {
            System.out.println("Der er valgt konge");
        }
        else if (person.getTitel().equals("Prins"))
        {
            System.out.println("Der er valgt Prins");
        }
        model.addAttribute("listTitler", listTitler); //overføre liste til dropbox

        return "dropbox";
    }




}
