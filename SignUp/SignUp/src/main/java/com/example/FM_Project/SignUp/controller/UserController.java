package com.example.FM_Project.SignUp.controller;

import com.example.FM_Project.SignUp.dto.LoginDto;
import com.example.FM_Project.SignUp.dto.LoginResponse;
import com.example.FM_Project.SignUp.dto.UserDto;
import com.example.FM_Project.SignUp.model.User;
import com.example.FM_Project.SignUp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @GetMapping("/api/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/api/users")
    public ResponseEntity<User> addUser(@RequestBody UserDto userDto) throws ParseException {

        User user = new User();
        user.setName(userDto.getName());
        user.setLastName(userDto.getLastName());
        user.setEmailId(userDto.getEmailId());
        user.setPassword(userDto.getPassword());
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setDateOfBirth(LocalDate.parse(userDto.getDateOfBirth()));
        User createdUser = userService.addUser(user);
        return ResponseEntity.ok(createdUser);
    }

    @PostMapping("/api/login")
    public ResponseEntity<?> login(@RequestBody LoginDto loginDto) {
        try {
            LoginResponse response = userService.login(loginDto);
            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("Invalid credentials");
        }
    }
}
