package com.bouncesite.ViewController;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class PagesController {
    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }
}