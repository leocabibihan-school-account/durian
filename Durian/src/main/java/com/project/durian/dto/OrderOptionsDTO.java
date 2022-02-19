package com.project.durian.dto;

import com.project.durian.model.OrderItem;

public class OrderOptionsDTO {

    private Long id;

    private OrderItem orderItem;

    private OrderOptionsDTO () {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }
}
