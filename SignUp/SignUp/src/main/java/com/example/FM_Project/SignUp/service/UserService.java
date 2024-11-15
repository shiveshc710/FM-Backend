package com.example.FM_Project.SignUp.service;

import com.example.FM_Project.SignUp.model.User;
import com.example.FM_Project.SignUp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
