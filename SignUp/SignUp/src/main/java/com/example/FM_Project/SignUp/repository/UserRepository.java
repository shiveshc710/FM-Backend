package com.example.FM_Project.SignUp.repository;


import com.example.FM_Project.SignUp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer>{


    @Query("SELECT COALESCE(MAX(u.userId), 0) FROM User u")
    Integer findMaxUserId();

}
