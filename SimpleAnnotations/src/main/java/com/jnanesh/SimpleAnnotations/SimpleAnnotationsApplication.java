package com.jnanesh.SimpleAnnotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SimpleAnnotationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleAnnotationsApplication.class, args);
	}

}
