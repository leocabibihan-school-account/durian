package com.project.durian.model;

import com.project.durian.dto.OrderDetailsDTO;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.criterion.Order;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;


@Entity
@Table(name ="order_details")
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer", nullable = false, insertable = false, updatable = false)
    private Customer customer_id;

    @Column(nullable = false)
    private double total;

//    @Column(nullable = false)
//    private int amount;

    @Column(nullable = false)
    private Boolean orderComplete;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime created_at;

    @Column
    @UpdateTimestamp
    private LocalDateTime modified_at;

    @Column()
    private String provider;

    @Column()
    private String status;

    //set of many orderitems
//    @OneToMany
//    @JoinColumn(name = "order_item")
    @OneToMany(mappedBy="order_details", fetch = FetchType.EAGER, cascade=CascadeType.REMOVE)
    private Set<OrderItem> order_items;



    public OrderDetails() {}

//    public OrderDetails(Long id) {
//        this.id = id;
//    }

    public OrderDetails(OrderDetailsDTO orderDetailsDTO) {
        this.customer_id = new Customer(orderDetailsDTO.getCustomerId());
        this.id = orderDetailsDTO.getId();
        this.total = orderDetailsDTO.getTotal();
//        this.amount = orderDetailsDTO.getAmount();
        this.orderComplete = orderDetailsDTO.getOrderComplete();

    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public double getTotal() { return total; }

    public void setTotal(double total) { this.total = total; }

//    public int getAmount() { return amount; }

//    public void setAmount(int amount) { this.amount = amount; }

    public String getProvider() { return provider; }

    public void setProvider(String provider) { this.provider = provider; }

    public String getStatus() { return status; }

    public Boolean getOrderComplete() {
        return orderComplete;
    }

    public Set<OrderItem> getOrderItems() {
        return order_items;
    }

    public Customer getCustomer() {
        return customer_id;
    }
}
