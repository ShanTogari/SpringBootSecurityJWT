package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SprinBootSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinBootSecurityJwtApplication.class, args);
        //Open postman
		// Select POST type request
		// Select body -> raw -> json
//	     	{
//			"name": "SAM",
//			"username":"sam",
//			"password": "nit",
//			"roles":["ADMIN","EMP"]
//			}
		// http://localhost:9090/user/save
	}

}
