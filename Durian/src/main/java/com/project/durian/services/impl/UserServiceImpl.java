package com.project.durian.services.impl;

import com.project.durian.dto.CustomerDTO;
import com.project.durian.dto.UserDTO;
import com.project.durian.model.Customer;
import com.project.durian.model.User;
import com.project.durian.repository.CustomerRepository;
import com.project.durian.repository.UserRepository;
import com.project.durian.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * For this demo app, we are not yet connected to a database.
 * We manage the data here in the service layer.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<UserDTO> list() {
        return StreamSupport.stream(userRepository.findAll().spliterator(), false)
                    .map((User t) -> new UserDTO(t))
                    .collect(Collectors.toList());
    }

    @Override
    public void add(UserDTO userDTO) {
        userRepository.save(new User(userDTO));
    }

    @Override
    public void add(CustomerDTO customerDTO) { customerRepository.save(new Customer(customerDTO));}

    @Override
    public void add(UserDTO userDTO, CustomerDTO customerDTO) {
        add(userDTO);
        add(customerDTO);
    }

    @Override
    public UserDTO get(Long id) {
        return new UserDTO(userRepository.findById(id).get());
    }

    @Override
    public void update(UserDTO updatedUser) {
        userRepository.save(new User(updatedUser));
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

}
