package com.project.durian.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name ="order_details")
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer", nullable = false)
    private Customer customer_id;

    @Column(nullable = false)
    private double total;

    @Column(nullable = false)
    private int amount;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime created_at;

    @Column
    @UpdateTimestamp
    private LocalDateTime modified_at;

    @Column(nullable = false)
    private String provider;

    @Column(nullable = false)
    private String status;

    public Long getId() { return id; }

    public double getTotal() { return total; }

    public int getAmount() { return amount; }

    public String getProvider() { return provider; }

    public String getStatus() { return status; }
}