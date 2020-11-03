package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@Controller
public class BulletListController
{
    List<String> listTitler = Arrays.asList("Konge", "Prins", "Bonde");

    @GetMapping("bulletlist")
    public String bulletListen(@ModelAttribute("person") Person person, Model model)
    {
        model.addAttribute("titler", listTitler);
        System.out.println("List"+ person);

        return "bulletList";
    }



}
