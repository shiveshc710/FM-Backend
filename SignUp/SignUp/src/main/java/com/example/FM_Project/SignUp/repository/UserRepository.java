package com.example.FM_Project.SignUp.repository;


import com.example.FM_Project.SignUp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long>{

//    List<User> getAllUsers();
}
