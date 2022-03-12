package com.project.durian.dto;

import java.time.LocalDateTime;

public class OrderDetailsDTO {

    private Long id;

    private double total;

    private int amount;

    private LocalDateTime created_at;

    private LocalDateTime modified_at;

    private String provider;

    private String status;

    private OrderDetailsDTO () {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
