package com.project.durian.dto;

import com.project.durian.model.Product;

public class ProductOptionDTO {

    private Long id;
    private String option;
    private String option_category;
    private String description;
    private double add_on_price;
    private Product product;

    private ProductOptionDTO () {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getOption_category() {
        return option_category;
    }

    public void setOption_category(String option_category) {
        this.option_category = option_category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAdd_on_price() {
        return add_on_price;
    }

    public void setAdd_on_price(double add_on_price) {
        this.add_on_price = add_on_price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
