package com.project.durian.controller;

import com.project.durian.dto.OrderDetailsDTO;
import com.project.durian.services.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cart")
public class CartController {
    @Autowired
    private OrderDetailsService orderDetailsService;
    //cart/{userid}
    //displays the cart
    //find the id of the orderdetails for the customer
    //model.addAttribute("cart", (ordetailsDto)orderDetailsService.get(userid))
    @GetMapping("/{userId}")
    private String getCart(@PathVariable Long userId, Model model) {
        //orderDetails.get(userid)
        model.addAttribute("cart", orderDetailsService.get(userId));
        return "cart/index";
    }


    //cart/{userid}/add/{productId} post
    //cart/{userid}/changeQuantity/{orderItemId}/{quantity}} put
    @PostMapping("/{userId}/add/{productId}")
    private String addToCart(@PathVariable Long userId, Model model) {
        return getCart(userId, model);
    }
    //cart/{userid}/checkout //get and post
}
