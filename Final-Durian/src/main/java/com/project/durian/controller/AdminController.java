package com.project.durian.controller;


import com.project.durian.dto.CustomerDTO;
import com.project.durian.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    private String list(Model model) {
        model.addAttribute("users", customerService.list());
        return "admin/index";
    }


    @GetMapping("/{id}")
    private String getUser(@PathVariable Long id, Model model) {
        model.addAttribute("user", customerService.get(id));
        return "admin/view-user";
    }

    @PutMapping
    private String updateUser(@Valid @ModelAttribute("customer") CustomerDTO user, BindingResult bindingResult, Model model) {

        if (customerService.validateUser(user, bindingResult)) {
            model.addAttribute("user", user);
            return "admin/view-user";
        }

        customerService.update(user);
        return list(model);
    }

    @DeleteMapping
    private String deleteUser(CustomerDTO user, Model model) {
        customerService.delete(user.getId());
        return list(model);
    }
}
