package com.example.FM_Project.SignUp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication()
@EnableJpaRepositories(basePackages = "com.example.FM_Project.SignUp.repository")
public class SignUpApplication {

	public static void main(String[] args) {

		SpringApplication.run(SignUpApplication.class, args);
	}

}
