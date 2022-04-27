package com.bouncesite.controller;

import com.bouncesite.model.Statistics;
import com.bouncesite.services.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PagesController {
    @Autowired
    private StatsService statsService;

    @GetMapping("/")
    public String index(Model model) {
        Statistics stats = statsService.fetchAll();
        model.addAttribute("stats", stats);
        return "index";
    }
}