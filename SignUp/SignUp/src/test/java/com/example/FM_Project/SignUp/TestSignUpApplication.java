package com.example.FM_Project.SignUp;

import org.springframework.boot.SpringApplication;

public class TestSignUpApplication {

	public static void main(String[] args) {
		SpringApplication.from(SignUpApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
