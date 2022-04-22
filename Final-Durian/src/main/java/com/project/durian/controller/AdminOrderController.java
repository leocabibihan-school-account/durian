package com.project.durian.controller;

import com.project.durian.dto.OrderDTO;
import com.project.durian.dto.ProductDTO;
import com.project.durian.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("admin-order")
public class AdminOrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    private String list(Model model) {
        model.addAttribute("orders", orderService.list());
        return "admin-order/index";
    }

    @GetMapping("/{id}")
    private String get(@PathVariable Long id, Model model) {
        model.addAttribute("orders", orderService.get(id));
        return "admin-order/view-order";
    }

    @PutMapping
    private String update(OrderDTO order, Model model) {
        orderService.update(order);
        return list(model);
    }

    @DeleteMapping
    private String delete(OrderDTO order, Model model) {
        orderService.delete(order.getId());
        return list(model);
    }
}
