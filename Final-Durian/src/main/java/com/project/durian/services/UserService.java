package com.project.durian.services;

import com.project.durian.dto.UserDTO;
import com.project.durian.dto.UserDTO;
import com.project.durian.model.User;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface UserService {


    List<UserDTO> list();


    void add(UserDTO user);

    boolean hasEmail(UserDTO user);

    boolean validateUser(UserDTO user, BindingResult bindingResult, Boolean isCreate);

    UserDTO get(Long id);

    void update(UserDTO updatedUser);

    void delete(Long id);


}
