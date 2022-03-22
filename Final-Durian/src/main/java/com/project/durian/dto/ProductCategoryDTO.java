package com.project.durian.dto;

import com.project.durian.model.Product;
import com.project.durian.model.ProductCategory;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductCategoryDTO {

    public ProductCategoryDTO() {
    }

    public ProductCategoryDTO(ProductCategory category) {
        this.id = category.getId();
        this.name = category.getName();
        this.description = category.getDescription();
        this.products = Optional.ofNullable(category.getProducts())
                .orElseGet(Collections::emptySet)
                .stream()
                .map(ProductDTO::new)
                .collect(Collectors.toSet());

    }

    private Long id;

    private String name;

    private String description;

    private Set<ProductDTO> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<ProductDTO> getProducts() {
        return products;
    }

}
