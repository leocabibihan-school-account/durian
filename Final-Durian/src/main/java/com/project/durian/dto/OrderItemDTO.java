package com.project.durian.dto;

import com.project.durian.model.Product;

public class OrderItemDTO {

    private Long id;

    private Product product;

    public Long getId() {
        return id;
    }

    private OrderItemDTO () {}

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
