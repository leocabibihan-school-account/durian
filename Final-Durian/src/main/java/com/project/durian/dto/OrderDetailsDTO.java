package com.project.durian.dto;

import com.project.durian.model.OrderDetails;

import java.time.LocalDateTime;

public class OrderDetailsDTO {

    private Long id;


    private double total;

    private int amount;

    private LocalDateTime created_at;

    private LocalDateTime modified_at;

    private Boolean orderComplete;

    private String provider;

    private String status;

    public OrderDetailsDTO () {}

    public OrderDetailsDTO(OrderDetails orderDetails) {
        this.id = orderDetails.getId();
        this.total = orderDetails.getTotal();
        this.amount = orderDetails.getAmount();
        this.orderComplete = orderDetails.getOrderComplete();
        this.provider = orderDetails.getProvider();
        this.status = orderDetails.getStatus();
    }

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

    public Boolean getOrderComplete() { return orderComplete; }

    public void setOrderComplete(Boolean orderComplete) { this.orderComplete = orderComplete; }

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
