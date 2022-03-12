package com.project.durian.services;

import com.project.durian.dto.CustomerDTO;
import com.project.durian.dto.UserDTO;
import com.project.durian.dto.UserDTO;
import com.project.durian.model.Customer;
import com.project.durian.model.User;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface UserService {


    List<UserDTO> list();


    void add(UserDTO user);

    public boolean hasEmail(UserDTO user);

    public boolean validateUser(UserDTO user, BindingResult bindingResult);

    UserDTO get(Long id);

    void update(UserDTO updatedUser);

    void delete(Long id);


}
