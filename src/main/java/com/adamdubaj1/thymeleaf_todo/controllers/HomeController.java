package com.adamdubaj1.thymeleaf_todo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String Hello(Model model){
        model.addAttribute("initialModelName", "Hello World!");
        return "hello";
    }
}
