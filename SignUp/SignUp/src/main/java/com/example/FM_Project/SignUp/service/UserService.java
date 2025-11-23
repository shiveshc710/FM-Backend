package com.example.FM_Project.SignUp.service;

import com.example.FM_Project.SignUp.Security.JwtUtil;
import com.example.FM_Project.SignUp.dto.LoginDto;
import com.example.FM_Project.SignUp.dto.LoginResponse;
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

    @Autowired
    private JwtUtil jwtUtil;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User addUser(User user) {

        Integer maxId = userRepository.findMaxUserId();
        user.setUserId(maxId + 1);

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public LoginResponse login(LoginDto loginDto) {
        User user = userRepository.findByEmailId(loginDto.getEmailId())
                .orElseThrow(() -> new RuntimeException("Invalid credentials"));

        if (!passwordEncoder.matches(loginDto.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }

        String token = jwtUtil.generateToken(user.getEmailId());

        LoginResponse response = new LoginResponse();
        response.setToken(token);
        response.setUserId(user.getUserId());
        response.setName(user.getName());
        response.setLastName(user.getLastName());
        response.setEmailId(user.getEmailId());

        return response;
    }

}
