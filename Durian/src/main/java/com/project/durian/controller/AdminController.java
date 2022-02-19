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
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @GetMapping
    private String list(Model model) {
        model.addAttribute("users", userService.list());
        return "admin/index";
    }

//    @GetMapping("/add")
//    private String getUserAddForm(Model model) {
//        model.addAttribute("user", new UserDTO());
//        return "user/sign-up";
//    }

//    @PostMapping
//    private String add(UserDTO user, Model model) {
//        user.setAdmin(false);
//        userService.add(user);
//        return list(model);
//    }

    @GetMapping("/{id}")
    private String getUser(@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.get(id));
        return "admin/view-user";
    }

    @PutMapping
    private String updateUser(UserDTO user, Model model) {
        userService.update(user);
        return list(model);
    }

    @DeleteMapping
    private String deleteUser(UserDTO user, Model model) {
        userService.delete(user.getId());
        return list(model);
    }
}
