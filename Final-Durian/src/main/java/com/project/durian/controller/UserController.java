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
@RequestMapping("user")
public class UserController {

    @Autowired
    private CustomerService customerService;


    @GetMapping("/sign-up")
    private String getUserAddForm(Model model) {
        model.addAttribute("user", new CustomerDTO());
        return "user/sign-up";
    }

    @PostMapping
    private String add(@Valid @ModelAttribute("user") CustomerDTO user, BindingResult bindingResult, Model model){

        if (customerService.validateUser(user, bindingResult))
        {
            model.addAttribute("user", user);
            return "user/sign-up";
        }


        customerService.add(user);
        return "redirect:/";
    }


}
