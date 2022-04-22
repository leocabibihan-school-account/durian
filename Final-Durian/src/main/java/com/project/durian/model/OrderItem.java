package com.project.durian.model;


import com.project.durian.dto.OrderItemDTO;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.criterion.Order;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "order_item")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Integer quantity;

//    @OneToMany
//    @JoinColumn(name = "order_id", nullable = false)
//    private Set<OrderDetails> orderDetails;
    @ManyToOne
    @JoinColumn(name = "order_details", nullable = false)
    private OrderDetails order_details;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product_id;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime created_at;

    @Column
    @UpdateTimestamp
    private LocalDateTime modified_at;

    public OrderItem() {}

    public OrderItem(OrderItemDTO orderItemDTO) {
        this.id = orderItemDTO.getId();
    }

    public Long getId() { return id; }

    public Integer getQuantity() { return quantity; }

    public LocalDateTime getCreated_at() { return created_at; }

    public LocalDateTime getModified_at() { return modified_at; }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product_id;
    }
}