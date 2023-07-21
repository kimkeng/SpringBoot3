package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args)
				.getBean(DemoApplication.class).execute();
	}
	@Autowired//의존성 주입을 했다.
	Greet greet;
	private void execute(){greet.greeting();}
}