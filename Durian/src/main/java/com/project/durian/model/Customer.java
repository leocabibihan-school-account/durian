package com.project.durian.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String first_name;

    @Column(nullable = false)
    private String last_name;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime created_at;

    @Column
    @UpdateTimestamp
    private LocalDateTime modified_at;

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
    private int mobile;

    @Column(nullable = false)
    private int telephone;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.REMOVE)
    private Set<CustomerPayment> customerPaymentList;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.MERGE)
    @PrimaryKeyJoinColumn
    private User user;

    public Long getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public LocalDateTime getModified_at() {
        return modified_at;
    }

    public String getAddress_line1() {
        return address_line1;
    }

    public String getAddress_line2() {
        return address_line2;
    }

    public String getCity() {
        return city;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public String getCountry() {
        return country;
    }

    public int getMobile() {
        return mobile;
    }

    public int getTelephone() {
        return telephone;
    }
}