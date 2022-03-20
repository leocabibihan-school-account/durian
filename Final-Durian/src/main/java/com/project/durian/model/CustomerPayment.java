package com.project.durian.model;

import com.project.durian.dto.CustomerPaymentDTO;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "customer_payment")
public class CustomerPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(nullable = false)
    private String payment_type;

    @Column(nullable = false)
    private String provider;

    @Column(nullable = false)
    private int account_no;

    @Column(nullable = false)
    private int expiry;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime created_at;

    @Column
    @UpdateTimestamp
    private LocalDateTime modified_at;

    public CustomerPayment() {}

    public CustomerPayment(CustomerPaymentDTO customerPaymentDTO) {
        this.id = customerPaymentDTO.getId();
        this.payment_type = customerPaymentDTO.getPaymentType();
        this.provider = customerPaymentDTO.getProvider();
        this.account_no = customerPaymentDTO.getAccountNo();
        this.expiry = customerPaymentDTO.getExpiry();
    }

    public Long getId() {
        return id;
    }

    public String getPayment_type() { return payment_type; }

    public String getProvider() {
        return provider;
    }

    public int getAccount_no() {
        return account_no;
    }

    public int getExpiry() {
        return expiry;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public LocalDateTime getModified_at() {
        return modified_at;
    }
}