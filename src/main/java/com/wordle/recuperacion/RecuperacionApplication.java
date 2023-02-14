package com.wordle.recuperacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan ("com.wordle.recuperacion.*")
public class RecuperacionApplication {
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RecuperacionApplication.class);
    }
	public static void main(String[] args) {
		System.out.println("ole los caracoleh");
		SpringApplication.run(RecuperacionApplication.class, args);
		
	}

}
