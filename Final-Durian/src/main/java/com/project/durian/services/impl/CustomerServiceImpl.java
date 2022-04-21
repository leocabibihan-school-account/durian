package com.project.durian.services.impl;

import com.project.durian.dto.CustomerDTO;
import com.project.durian.dto.UserDTO;
import com.project.durian.repository.CustomerRepository;
import com.project.durian.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public CustomerDTO get(Long id) { return new CustomerDTO(customerRepository.findById(id).get());}
}
