package com.revature.revagenda_backend.controllers;

import com.revature.revagenda_backend.models.User;
import com.revature.revagenda_backend.services.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public User createUser(User user) {
        return this.userService.save(user);
    }

    public User getUser(Integer id) {
        return this.userService.findById(id);
    }


}
