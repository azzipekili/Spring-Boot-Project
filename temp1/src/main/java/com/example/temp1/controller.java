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

    @RequestMapping(value = "/pay")
    public String pay() {
        return "pay";
    }

    @RequestMapping(value = "/donate")
    public String donate() {
        return "donate";
    }

    @RequestMapping(value = "/about_large")
    public String about_large() {
        return "about_large";
    }
}
