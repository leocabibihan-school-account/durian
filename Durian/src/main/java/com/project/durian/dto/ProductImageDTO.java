package com.project.durian.dto;

import com.project.durian.model.Product;

import java.util.Set;

public class ProductImageDTO {

    private Long id;

    private String image;

    private Product product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
