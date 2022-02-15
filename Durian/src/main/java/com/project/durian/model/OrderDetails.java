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

    @OneToOne
    @JoinColumn(name = "payment_details", nullable = false)
    private PaymentDetails payment_id;

    @Column(nullable = false)
    private int amount;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime created_at;

    @Column
    @UpdateTimestamp
    private LocalDateTime modified_at;

}
