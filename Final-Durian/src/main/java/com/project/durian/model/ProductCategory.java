package com.project.durian.model;

import com.project.durian.dto.ProductCategoryDTO;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "product_category")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime created_at;

    @Column
    @UpdateTimestamp
    private LocalDateTime modified_at;

    @OneToMany(mappedBy = "category", cascade = CascadeType.REMOVE)
    private Set<Product> products;

    public ProductCategory() {
    }

    public ProductCategory(ProductCategoryDTO productCategoryDTO) {
        this.id = productCategoryDTO.getId();
        this.name = productCategoryDTO.getName();
        this.description = productCategoryDTO.getDescription();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public LocalDateTime getModified_at() {
        return modified_at;
    }

    public Set<Product> getProducts() {
        return products;
    }
}
