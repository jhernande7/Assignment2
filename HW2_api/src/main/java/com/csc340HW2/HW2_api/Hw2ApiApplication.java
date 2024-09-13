package com.csc340HW2.HW2_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Hw2ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Hw2ApiApplication.class, args);
	}

}
