package com.tasks.TaskDemoCoopeuch;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaskDemoCoopeuchApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskDemoCoopeuchApplication.class, args);
	}
	@Bean
	ModelMapper modelMapper(){
		return new ModelMapper();
	}
}
