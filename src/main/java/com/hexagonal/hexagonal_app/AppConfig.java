package com.hexagonal.hexagonal_app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hexagonal.hexagonal_app.domain.entities.User;

@Configuration
public class AppConfig {

    @Bean
    List<User> users(){
        List<User> users = new ArrayList<>();
             users.add(new User(1L,"Carlos","Patiño"));
             return users;
    }
}
