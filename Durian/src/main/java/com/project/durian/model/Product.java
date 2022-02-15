package com.project.durian.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

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