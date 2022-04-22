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
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @GetMapping
    private String list(Model model) {
        model.addAttribute("users", userService.list());
        return "admin/index";
    }


    @GetMapping("/{id}")
    private String getUser(@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.get(id));
        return "admin/view-user";
    }

    @PutMapping
    private String updateUser(@Valid @ModelAttribute("user") UserDTO user, BindingResult bindingResult, Model model) {

        if (userService.validateUser(user, bindingResult, false)) {
            model.addAttribute("user", user);
            return "admin/view-user";
        }

        userService.update(user);
        return list(model);
    }

    @DeleteMapping
    private String deleteUser(UserDTO user, Model model) {
        userService.delete(user.getId());
        return list(model);
    }
}
