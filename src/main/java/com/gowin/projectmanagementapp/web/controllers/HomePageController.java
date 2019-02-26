package com.gowin.projectmanagementapp.web.controllers;

import com.gowin.projectmanagementapp.web.entities.Project;
import com.gowin.projectmanagementapp.web.repositories.ProjectRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomePageController {
    private ProjectRepository projectRepository;

    public HomePageController(ProjectRepository projectRepository){
        this.projectRepository = projectRepository;


        }
    }

