package com.revature.revagenda_backend.controllers;

import com.revature.revagenda_backend.exceptions.UsernameNotUniqueException;
import com.revature.revagenda_backend.models.User;
import com.revature.revagenda_backend.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public User getUser(Integer id) {
        return this.userService.findById(id);
    }

    @GetMapping(path = "/")
    public List<User> getAllUsers() {
        return this.userService.getAll();
    }

    @GetMapping(path = "/{username}")
    public User getUser(@PathVariable String username) {
        return this.userService.findByUsername(username);
    }

    @PostMapping(path = "/")
    public User createUser(@RequestBody User user) {
        return this.userService.save(user);
    }


    @ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT, reason = "this is the reason")
    @ExceptionHandler({UsernameNotUniqueException.class, Exception.class})
    public String handleException(Exception e) {
        System.out.println("DEBUG: EXCEPTION HANDLER");
        return e.getMessage();
    }




}
