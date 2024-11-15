package com.example.FM_Project.SignUp.model;

import lombok.*;

import jakarta.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "fm_users")
public class User {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private Long userId;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email_id")
    private String emailId;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;

}
