package com.project.durian.dto;

import com.project.durian.model.Customer;
import com.project.durian.model.User;
import javax.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public class CustomerDTO {

    private Long id;

    @NotBlank(message = "Firstname is Required")
    private String firstName;

    @NotBlank(message = "Lastname is Required")
    private String lastName;

    @NotBlank(message = "Address is Required")
    private String addressLine1;

    private String addressLine2;

    @NotBlank(message = "City is Required")
    private String city;

    @NotBlank(message = "Postal Code is Required")
    private String postalCode;

    @NotBlank(message = "Phone number is Required")
    private int telephone;

    @NotBlank(message = "Country is Required")
    private String country;

    private User user;

    public CustomerDTO() {}
    
    public CustomerDTO(Customer customer) {
        this.id = customer.getId();
        this.firstName = customer.getFirst_name();
        this.lastName = customer.getLast_name();
        this.addressLine1 = customer.getAddress_line1();
        this.addressLine2 = customer.getAddress_line2();
        this.city = customer.getCity();
        this.postalCode = customer.getPostal_code();
        this.telephone = customer.getTelephone();
        this.country = customer.getCountry();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCountry() {
        return country;
    }
}
