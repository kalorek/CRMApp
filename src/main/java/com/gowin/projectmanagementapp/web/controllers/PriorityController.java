package com.gowin.projectmanagementapp.web.controllers;

import com.gowin.projectmanagementapp.web.entities.Priority;
import com.gowin.projectmanagementapp.web.repositories.PriorityRepository;
import com.gowin.projectmanagementapp.web.repositories.StatusRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/priorities")
public class PriorityController {
    private PriorityRepository priorityRepository;
    public PriorityController(PriorityRepository priorityRepository) {
        this.priorityRepository = priorityRepository;
    }

    @GetMapping
    public String preparePriorityList(Model model) {
        List<Priority> priorities = priorityRepository.findAll();
        model.addAttribute("priorities", priorities);
        return "priorities";
    }

}
