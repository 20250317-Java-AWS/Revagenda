package com.revature.revagenda_backend.services;

import com.revature.revagenda_backend.exceptions.UsernameNotUniqueException;
import com.revature.revagenda_backend.models.User;
import com.revature.revagenda_backend.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) /*throws UsernameNotUniqueException*/ {
        return this.userRepository.save(user);
    }

    public User findById(Integer id) {
        return this.userRepository.findById(id).get();//build more robust null checking later
    }

    public List<User> getAll() {
        return this.userRepository.findAll();
    }



}
