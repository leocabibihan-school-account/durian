package com.project.durian.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "product_option")
public class ProductOption {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String option;

    @Column(nullable = false)
    private String option_category;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private double add_on_price;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime created_at;

    @Column
    @UpdateTimestamp
    private LocalDateTime modified_at;

    public Long getId() { return id; }

    public String getOption() { return option; }

    public String getOption_category() { return option_category; }

    public String getDescription() { return description; }

    public double getAdd_on_price() { return add_on_price; }

    public LocalDateTime getCreated_at() { return created_at; }

    public LocalDateTime getModified_at() { return modified_at; }
}