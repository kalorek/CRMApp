package com.gowin.projectmanagementapp.web.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/test")

public class TestController {
    @RequestMapping

    public String hello(){
        return "Hello";
    }





    }


