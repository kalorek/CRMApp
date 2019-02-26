package com.gowin.projectmanagementapp.web.controllers;

import com.gowin.projectmanagementapp.web.entities.Project;
import com.gowin.projectmanagementapp.web.entities.Status;
import com.gowin.projectmanagementapp.web.repositories.ProjectRepository;
import com.gowin.projectmanagementapp.web.repositories.StatusRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/statuses")
public class StatusController {

    private StatusRepository statusRepository;

    public StatusController(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    @GetMapping
    public String prepareStatusList(Model model) {
        List<Status> statuses = statusRepository.findAll();
        model.addAttribute("statuses", statuses);
        return "statuses";
    }
}
