package com.project.durian.services.impl;

import com.project.durian.dto.OrderDTO;
import com.project.durian.dto.ProductDTO;
import com.project.durian.model.Orders;
import com.project.durian.repository.OrderRepository;
import com.project.durian.services.OrderService;
import com.project.durian.services.ProductService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductService productService;

    @Override
    public List<OrderDTO> list() {
        return StreamSupport.stream(orderRepository.findAll().spliterator(), false)
                .map(OrderDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public void add(OrderDTO orderDTO) {
        ProductDTO product = productService.get(orderDTO.getProductId());
        orderDTO.setProductName(product.getName());
        product.setQuantity(product.getQuantity() - orderDTO.getQuantity());
        //remove quantity from product
        orderRepository.save(new Orders(orderDTO));
    }
    @Override
    public OrderDTO get(Long id) {
        return new OrderDTO(orderRepository.findById(id).get());
    }

    @Override
    public void update(OrderDTO orderDTO) {
        orderRepository.save(new Orders(orderDTO));
    }

    @Override
    public void delete(Long id) {
        orderRepository.deleteById(id);
    }
}
