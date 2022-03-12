package com.project.durian.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "product_inventory")
public class ProductInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private int quantity;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime created_at;

    @Column
    @UpdateTimestamp
    private LocalDateTime modified_at;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    public Long getId() { return id; }

    public int getQuantity() { return quantity; }

    public LocalDateTime getCreated_at() { return created_at; }

    public LocalDateTime getModified_at() { return modified_at; }
}