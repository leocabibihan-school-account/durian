package com.project.durian.controller;


import com.project.durian.dto.UserDTO;
import com.project.durian.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;



    @GetMapping("/sign-up")
    private String getUserAddForm(Model model) {
        model.addAttribute("user", new UserDTO());
        return "user/sign-up";
    }

    @PostMapping
    private String add(UserDTO user, Model model) {
        user.setAdmin(false);
        userService.add(user);
        return "index";
    }


}
