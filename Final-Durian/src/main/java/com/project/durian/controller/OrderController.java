package com.project.durian.controller;


import com.project.durian.dto.OrderDTO;
import com.project.durian.dto.ProductDTO;
import com.project.durian.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("{productId}")
    private String orderForm(@PathVariable Long productId, Model model) {
        OrderDTO order = new OrderDTO();
        order.setProductId(productId);
        model.addAttribute("orders", order);
//        model.addAttribute("product_id", productId);
        return "order/index";
    }

    @PostMapping("")
    private String add(@Valid @ModelAttribute("orders") OrderDTO orderDTO, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("orders", orderDTO);
            return "admin-product/add-product";
        }
        orderService.add(orderDTO);
        return "redirect:/";
    }
}
