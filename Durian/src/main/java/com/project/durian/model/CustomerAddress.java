package com.project.durian.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "customer_address")
public class CustomerAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(nullable = false)
    private String  address_line1;

    @Column(nullable = false)
    private String  address_line2;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String  postal_code;

    @Column(nullable = false)
    private String  country;

    @Column(nullable = false)
    private int telephone;

    @Column(nullable = false)
    private int mobile;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime created_at;

    @Column
    @UpdateTimestamp
    private LocalDateTime modified_at;

}
