package com.estacio.work.extension.app.controllers;


import com.estacio.work.extension.app.exceptions.UserExceptions;
import com.estacio.work.extension.app.models.user.User;
import com.estacio.work.extension.app.models.user.UserCreate;
import com.estacio.work.extension.app.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    List<User> all() {
        return userService.findAll();
    }

    @PostMapping("/users")
    User newEmployee(@RequestBody UserCreate newEmployee) {
        return userService.create(newEmployee);
    }

    @GetMapping("/users/{id}")
    User one(@PathVariable Long id) throws UserExceptions {
        return userService.findById(id)
                .orElseThrow(UserExceptions::new);
    }

    @DeleteMapping("/users/{id}")
    void deleteEmployee(@PathVariable Long id) {
        userService.deleteById(id);
    }
}
