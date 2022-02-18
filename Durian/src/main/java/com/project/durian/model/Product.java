package com.project.durian.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private int price;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime created_at;

    @Column
    @UpdateTimestamp
    private LocalDateTime modified_at;

    @OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
    private Set<ProductCategory> productCategoryList;

    @OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
    private Set<ProductInventory> productInventoryList;

    @OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
    private Set<ProductImage> productImageList;

    @OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
    private Set<ProductOption> productOptionList;

    public Long getId() { return id; }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public int getPrice() { return price; }

    public LocalDateTime getCreated_at() { return created_at; }

    public LocalDateTime getModified_at() { return modified_at; }
}