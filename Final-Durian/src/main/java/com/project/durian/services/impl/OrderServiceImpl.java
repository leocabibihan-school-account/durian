package com.project.durian.services.impl;

import com.project.durian.dto.CustomerDTO;
import com.project.durian.dto.OrderDetailsDTO;
import com.project.durian.dto.OrderItemDTO;
import com.project.durian.model.Customer;
import com.project.durian.model.OrderDetails;
import com.project.durian.repository.CustomerRepository;
import com.project.durian.repository.OrderDetailsRepository;
import com.project.durian.repository.OrderItemRepository;
import com.project.durian.repository.UserRepository;
import com.project.durian.services.OrderService;
import org.hibernate.criterion.Order;
import org.hibernate.mapping.Set;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDetailsRepository orderDetailsRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderItemRepository orderItemRepository;


    public class Cart implements OrderService.Cart {
        OrderDetails order;

        public Cart(OrderDetails order) {
            this.order = order;
        }

        @Override
        public List<OrderItemDTO> listCartItems() {
            return null;
        }

        @Override
        public void add(Long productId) {
            //if product quantity is 0 don't add
            //don't add more than existing
        }

        @Override
        public void remove(Long id) {

        }

        @Override
        public void changeQuantity(Long id, Integer quantityAdded) {
            //can't change quantity larger than existing inventory
            //remove if quantity change to 0
        }

        @Override
        public Integer totalPrice() {
            return null;
        }
    }

    @Override
    public Cart getCurrentCart(CustomerDTO customer) {
//        //check all carts of the customer
//       Set<OrderDetails> customerOrders = orderDetailsRepository.findAllByCustomerIs(new Customer(customer));
//
//        //if customer has an existing cart, return that otherwise make a new cart
//        if (//given customer does not have completed orderdetails) {
//            return new Cart(orderDetailsRepository.save(new OrderDetails()));
//        } else {
//            return new Cart(//get's the most recent orderdetails of the customer that )
//        }
        return null;

    }

    @Override
    public void createOrder(CustomerDTO customer, OrderDetailsDTO orderDetails) {
        //take the current cart

        //fill in the rest of the details, like from the checkout

        //set cart to complete

        //create new cart
    }
}
