package com.TraineeManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com")
@EntityScan(basePackages = {"com.cg.TraineeManagementSystem.bean"})
@SpringBootApplication
public class TraineeManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraineeManagementSystemApplication.class, args);
	}

}
