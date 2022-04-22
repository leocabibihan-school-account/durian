package com.project.durian.services.impl;

import com.project.durian.dto.CustomerDTO;
import com.project.durian.model.Customer;
import com.project.durian.repository.CustomerRepository;
import com.project.durian.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<CustomerDTO> list() {
        return StreamSupport.stream(customerRepository.findAll().spliterator(), false)
                .map(CustomerDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public void add(CustomerDTO customer) {
        customerRepository.save(new Customer(customer));
    }

    @Override
    public boolean hasEmail(CustomerDTO customer) {
        return StreamSupport.stream(customerRepository.findAll().spliterator(), false)
                .anyMatch((Customer user)-> user.getEmail().equals(customer.getEmail()));
    }

    @Override
    public boolean validateUser(CustomerDTO customer, BindingResult bindingResult) {
        if (hasEmail(customer)) {
            bindingResult.addError(new ObjectError("user", "Email already exists") );
        }
        return bindingResult.hasErrors();
    }

    @Override
    public CustomerDTO get(Long id) { return new CustomerDTO(customerRepository.findById(id).get());}


    @Override
    public void update(CustomerDTO updatedCustomer) {
        customerRepository.save(new Customer(updatedCustomer));
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }
}
