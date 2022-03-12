package com.project.durian.dto;

import com.project.durian.model.Product;

public class ProductInventoryDTO {

    private Long id;
    private int quantity;
    private Product product;

    private ProductInventoryDTO () {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
