package com.project.durian.dto;

import com.project.durian.model.Orders;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class OrderDTO {

    private Long id;

    @NotNull(message = "Quantity required")
    private Integer quantity;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is Required")
    private String email;

    private Long productId;

    private String productName;

    @NotBlank(message = "Firstname is Required")
    private String first_name;

    @NotBlank(message = "Lastname is Required")
    private String lastName;

    @NotBlank(message = "Address is Required")
    private String addressLine1;

    private String addressLine2;

    @NotBlank(message = "City is Required")
    private String city;

    @NotBlank(message = "Postal Code is Required")
    private String postalCode;

//    @NotBlank(message = "Phone number is Required")
//    private int mobile;

    @NotBlank(message = "Country is Required")
    private String country;

    public OrderDTO() {

    }
    
    public OrderDTO(Orders orders) {
        this.id = orders.getId();
        this.quantity = orders.getQuantity();
        this.email = orders.getEmail();
        this.first_name = orders.getFirst_name();
        this.lastName = orders.getLast_name();
        this.addressLine1 = orders.getAddress_line1();
        this.addressLine2 = orders.getAddress_line2();
        this.city = orders.getCity();
        this.postalCode = orders.getPostal_code();
        this.country = orders.getCountry();
//        this.mobile = orders.getMobile();

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

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

//    public int getMobile() {
//        return mobile;
//    }
//
//    public void setMobile(int mobile) {
//        this.mobile = mobile;
//    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
