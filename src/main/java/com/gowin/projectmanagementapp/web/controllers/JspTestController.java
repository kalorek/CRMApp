package com.gowin.projectmanagementapp.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsp-test")
public class JspTestController {
    @GetMapping
    public String test(Model model){
        model.addAttribute("text", "Hello, world!");
        return "test";
    }

}
