package com.project.durian.services;

import com.project.durian.dto.CustomerDTO;
import com.project.durian.dto.UserDTO;
import com.project.durian.dto.UserDTO;
import com.project.durian.model.Customer;
import com.project.durian.model.User;

import java.util.List;

public interface UserService {


    List<UserDTO> list();

    void add(CustomerDTO customer);

    void add(UserDTO user);

    void add(UserDTO user, CustomerDTO customer);



    UserDTO get(Long id);

    void update(UserDTO updatedUser);

    void delete(Long id);


}
