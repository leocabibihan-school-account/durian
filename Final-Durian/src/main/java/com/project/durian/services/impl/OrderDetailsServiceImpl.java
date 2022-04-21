package com.project.durian.services.impl;

import com.project.durian.dto.OrderDetailsDTO;
import com.project.durian.dto.ProductDTO;
import com.project.durian.repository.OrderDetailsRepository;
import com.project.durian.services.OrderDetailsService;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class OrderDetailsServiceImpl {

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;



    @Override
    public OrderDetailsDTO get(Long customerId) {
        //create an order dto with the user id
        OrderDetailsDTO newCart = new OrderDetailsDTO();
        newCart.setCustomer(customerService.get(customerId));
        return StreamSupport.stream(orderDetailsRepository.findAll().spliterator(), false)
                .filter(t -> t.getCustomer().equals(customerId))
                .filter(t -> t.getOrderComplete().equals(true))
                .findFirst()
                .orElse(orderDetailsRepository.save(newCart));
    }

}
