package com.gowin.projectmanagementapp.web.controllers;

import com.gowin.projectmanagementapp.web.entities.Project;
import com.gowin.projectmanagementapp.web.entities.User;
import com.gowin.projectmanagementapp.web.repositories.ProjectRepository;
import com.gowin.projectmanagementapp.web.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public String prepareUserList(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "users";
    }
}
