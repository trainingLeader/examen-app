package com.hexagonal.hexagonal_app.infrastructure.repository.product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexagonal.hexagonal_app.application.service.product.IUserService;
import com.hexagonal.hexagonal_app.domain.entities.User;

import java.util.List;
import java.util.Optional;

@Service
public class UserImpl implements IUserService {

    @Autowired
    private List<User> users;

    

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        return users.stream().filter( usr -> usr.getId().equals(id) ).findFirst();
    }
}
