package com.project.durian.dto;

import com.project.durian.model.OrderItem;
import com.project.durian.model.Product;

public class OrderItemDTO {

    private Long id;

    private Integer quantity;

    private Product product;

    public OrderItemDTO () {}

    public OrderItemDTO(OrderItem orderItem) {
        this.id = orderItem.getId();
        this.quantity = orderItem.getQuantity();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() { return quantity; }

    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
