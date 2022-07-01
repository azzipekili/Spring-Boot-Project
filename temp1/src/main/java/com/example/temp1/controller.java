package com.example.temp1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
    @RequestMapping(value = "/")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/register")
    public String register() {
        return "registration";
    }

    @RequestMapping(value = "/about")
    public String about() {
        return "about";
    }
}
