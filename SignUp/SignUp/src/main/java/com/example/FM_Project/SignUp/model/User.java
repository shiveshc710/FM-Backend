package com.example.FM_Project.SignUp.model;

import lombok.*;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "fm_users")
public class User {

    @Id
    @Column(name = "userid")
    private Integer userId;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email_id")
    private String emailId;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;

}
