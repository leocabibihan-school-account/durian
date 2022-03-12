package com.project.durian.repository;

import com.project.durian.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {



}
