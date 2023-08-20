package com.diegojnb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
    "com.diegojnb.calculator.infrastructure.adapter.api",
    "com.diegojnb.calculator.infrastructure.service",
})

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
