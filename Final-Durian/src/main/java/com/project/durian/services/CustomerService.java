package com.project.durian.services;

import com.project.durian.dto.CustomerDTO;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface CustomerService {

    CustomerDTO get(Long id);

    List<CustomerDTO> list();


    void add(CustomerDTO customer);

    public boolean hasEmail(CustomerDTO customer);

    public boolean validateUser(CustomerDTO customer, BindingResult bindingResult);


    void update(CustomerDTO updatedCustomer);

    void delete(Long id);
}
