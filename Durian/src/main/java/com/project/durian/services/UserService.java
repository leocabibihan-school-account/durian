package com.project.durian.services;

import com.project.durian.dto.UserDTO;
import com.project.durian.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> list();

    void add(UserDTO user);

    UserDTO get(Long id);

    void update(UserDTO updatedUser);

    void delete(Long id);

}
