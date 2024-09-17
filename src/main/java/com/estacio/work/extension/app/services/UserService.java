package com.estacio.work.extension.app.services;


import com.estacio.work.extension.app.entities.UserEntity;
import com.estacio.work.extension.app.models.user.User;
import com.estacio.work.extension.app.models.user.UserCreate;
import com.estacio.work.extension.app.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(UserCreate user) {
        return userRepository.save(user.toUserEntity()).toUser();
    }

    public List<User> findAll() {
        return userRepository.findAll().stream().map(UserEntity::toUser).toList();
    }

    public Optional<User> findById(Long id) {
        Optional<UserEntity> existingUser = userRepository.findById(id);
        return existingUser.map(UserEntity::toUser);
    }

    public void deleteById(Long id) {

    }
}
