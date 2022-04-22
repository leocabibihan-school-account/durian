package com.project.durian.model;

import com.project.durian.dto.OrderDTO;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String first_name;

    @Column(nullable = false)
    private String last_name;

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

//    @Column(nullable = false)
//    private int mobile;

    @Column(nullable = false)
    private String product_name;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime created_at;

    @Column
    @UpdateTimestamp
    private LocalDateTime modified_at;

    public Orders(){

    }

    public Orders(Long id){
        this.id = id;
    }

    public Orders(OrderDTO orderDTO) {
        this.id = orderDTO.getId();
        this.quantity = orderDTO.getQuantity();
        this.email = orderDTO.getEmail();
        this.first_name = orderDTO.getFirstName();
        this.last_name = orderDTO.getLastName();
        this.address_line1 = orderDTO.getAddressLine1();
        this.address_line2 = orderDTO.getAddressLine2();
        this.city = orderDTO.getCity();
        this.postal_code = orderDTO.getPostalCode();
        this.country = orderDTO.getCountry();
//        this.mobile = orderDTO.getMobile();
        this.product_name = orderDTO.getProductName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getEmail() {
        return email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
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

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public String getCountry() {
        return country;
    }

//    public int getMobile() {
//        return mobile;
//    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public LocalDateTime getModified_at() {
        return modified_at;
    }

    public String getProduct_name() {
        return product_name;
    }
}
