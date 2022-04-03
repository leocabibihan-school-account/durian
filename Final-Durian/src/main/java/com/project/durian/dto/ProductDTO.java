package com.project.durian.dto;

import com.project.durian.model.Customer;
import com.project.durian.model.Product;
import org.springframework.beans.factory.annotation.Required;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductDTO {

    private Long id;
    @NotBlank(message = "Name Required")
    private String name;
    @NotBlank(message = "Description Required")
    private String description;
    @NotNull(message = "price required")
    private Integer price;

    private Set<ProductOptionDTO> productOptions;

    public ProductDTO() {
    }

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.price = product.getPrice();
        this.productOptions = Optional.ofNullable(product.getProductOptionList())
                .orElseGet(Collections::emptySet)
                .stream()
                .map(ProductOptionDTO::new)
                .collect(Collectors.toSet());

    }

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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    public Set<ProductOptionDTO> getProductOptions() {
        return productOptions;
    }
}
