package com.estacio.work.extension.app.services;


import com.estacio.work.extension.app.models.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    public void create(User user) {

    }

    public List<User> findAll() {
        return List.of();
    }

    public User save(User newEmployee) {
        return null;
    }

    public Optional<User> findById(Long id) {
        throw new UnsupportedOperationException();
    }

    public void deleteById(Long id) {

    }
}
