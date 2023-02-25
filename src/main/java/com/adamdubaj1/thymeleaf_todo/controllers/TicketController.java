package com.adamdubaj1.thymeleaf_todo.controllers;

import com.adamdubaj1.thymeleaf_todo.models.Ticket;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TicketController {

    private List<Ticket> tickets;

    TicketController(){
        Ticket t1 = new Ticket("Create User", "Task");
        Ticket t2 = new Ticket("Implement something", "Story");
        tickets = new ArrayList<>(5);
        tickets.add(t1);
        tickets.add(t2);
    }

    @GetMapping("/")
    public String Hello(Model model){
        return "redirect:/ticket";
    }

    @GetMapping("/ticket")
    public String getTicket(Model model){
        model.addAttribute("tickets", tickets);
        model.addAttribute("newTicket", new Ticket()); //pusty obj do obslugi
        return "ticket";
    }

    @PostMapping("/add")
    public String addTicket(@ModelAttribute Ticket ticket){
        tickets.add(ticket);
        return "redirect:/ticket";
    }
}
