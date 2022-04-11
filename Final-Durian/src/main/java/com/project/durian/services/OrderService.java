package com.project.durian.services;

import com.project.durian.dto.CustomerDTO;
import com.project.durian.dto.OrderDetailsDTO;
import com.project.durian.dto.OrderItemDTO;
import com.project.durian.model.OrderItem;

import java.util.List;

//order details
//order item
//product
public interface OrderService {
    interface Cart {
        List<OrderItemDTO> listCartItems();

        //takes the product id and makes an orderItem
        void add(Long productId);

        void remove(Long id);

        //removes item if it goes to 0
        //disable if adding order item quantity exceeds product quantity
        void changeQuantity(Long id, Integer quantityAdded);

        Integer totalPrice();
    }


    //implementation creates new cart if it doesn't exist or none are new carts
    //returns most recently created cart/orderdetails that is not completed, boolean
    Cart getCurrentCart(CustomerDTO customer);

    //clear the current cart and create a new one
    //save the new orderItem details
    void createOrder(CustomerDTO customer, OrderDetailsDTO orderDetails);





}
