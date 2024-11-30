package com.example.FM_Project.SignUp.service;

import com.example.FM_Project.SignUp.dto.UserDto;
import com.example.FM_Project.SignUp.model.User;
import com.example.FM_Project.SignUp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("UserService")
public class UserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User addUser(User user) {

        Integer maxId = userRepository.findMaxUserId();
        user.setUserId(maxId + 1);

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

}
