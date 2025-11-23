package com.example.FM_Project.SignUp.dto;

import lombok.Data;

@Data
public class LoginResponse {
    private String token;
    private Integer userId;
    private String name;
    private String lastName;
    private String emailId;
}
