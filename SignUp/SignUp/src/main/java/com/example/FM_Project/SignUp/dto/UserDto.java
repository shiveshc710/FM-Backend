package com.example.FM_Project.SignUp.dto;

import lombok.*;

import jakarta.persistence.*;

import java.util.Date;

@Data
public class UserDto {

    @Id
    private Integer userId;


    private String phoneNumber;

    private String emailId;
    private String dateOfBirth;
    private String password;
    private String name;
    private String lastName;

}
