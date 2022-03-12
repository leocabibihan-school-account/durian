package com.project.durian.controller;


import com.project.durian.dto.UserDTO;
import com.project.durian.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
    private String add(@Valid @ModelAttribute("user") UserDTO user, BindingResult bindingResult, Model model){
        user.setAdmin(false);
        if (userService.validateUser(user, bindingResult))
        {
            model.addAttribute("user", user);
            return "user/sign-up";
        }


        userService.add(user);
        return "index";
    }


}
