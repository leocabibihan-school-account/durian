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

    /*
    public Customer() {}

    public Customer(CustomerDTO customerDTO) {
        this.user = new User(userDTO.getUserId());
        this.first_name = addressDTO.getFirstName();
        this.last_name = addressDTO.getLastName();
        this.telephone = addressDTO.getTelephone();
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public String getTelephone() {
        return telephone;
    }

    public LocalDateTime getDateCreated() {
        return created_at;
    }

    public LocalDateTime getDateUpdated() {
        return modified_at;
    } */

}