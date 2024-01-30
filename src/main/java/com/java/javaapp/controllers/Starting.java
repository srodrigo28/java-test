package com.java.javaapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Starting {
    
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
