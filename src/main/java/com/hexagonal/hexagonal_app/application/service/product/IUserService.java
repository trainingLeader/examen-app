package com.hexagonal.hexagonal_app.application.service.product;

import java.util.List;
import java.util.Optional;

import com.hexagonal.hexagonal_app.domain.entities.User;


public interface IUserService {
    List<User> findAll();
    Optional<User> findById(Long id);
}
