package com.project.durian.services;

import com.project.durian.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    List<OrderDTO> list();

    void add(OrderDTO orderDTO);

    OrderDTO get(Long id);

    void update(OrderDTO orderDTO);

    void delete(Long id);
}
