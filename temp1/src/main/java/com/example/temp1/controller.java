package com.example.temp1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class controller {
    @Autowired
    private StudentService service;

    List<String> courses;

    @RequestMapping(value = "/")
    public String homepage() {
        return "home";
    }

    @RequestMapping(value = "/home")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/register")
    public String home1(Model model, Student student) {
        model.addAttribute("student", new Student());
        return "registration";
    }

    @RequestMapping(value = "/pay")
    public String pay() {
        return "pay";
    }

    @RequestMapping(value = "/donate")
    public String donate() {
        return "donate";
    }

    @RequestMapping(value = "/home_large")
    public String about_large() {
        return "home_large";
    }

    @RequestMapping(value = "/test")
    public String home2(Model model, Student student) {
        model.addAttribute("student", new Student());
        return "register";
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String register(@ModelAttribute("student") Student student, Model model) {
        model.addAttribute("student", student);
        service.save(student);
        return "welcome";
    }
    @RequestMapping(value = "/cancel")
    public String cancel() {
        return "cancel";
    }

    @RequestMapping(value = "/success")
    public String success() {
        return "success";
    }

    @RequestMapping(value = "/connection")
    public String connection() {
        return "connection";
    }

}
