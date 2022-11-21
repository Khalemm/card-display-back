package com.example.carddisplayback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"controller"})
public class CardDisplayBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardDisplayBackApplication.class, args);
	}

}
