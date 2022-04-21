package com.project.durian.controller;

import com.project.durian.dto.OrderDetailsDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cart")
public class CartController {
    //cart/{userid}
    //displays the cart
    //find the id of the orderdetails for the customer
    //model.addAttribute("cart", (ordetailsDto)orderDetailsService.get(userid))
    @GetMapping("/{userId}")
    private String getUser(@PathVariable Long userId, Model model) {
        //orderDetails.get(userid)
        model.addAttribute("cart", new OrderDetailsDTO());
        return "cart/index";
    }


    //cart/{userid}/add/{productId} post
    //cart/{userid}/changeQuantity/{orderItemId}/{quantity}} put
    //
    //cart/{userid}/checkout //get and post
}
