package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwaggerUiApplication {
/**
 * http://localhost:9900/swagger-ui.html
 * @param args
 */
	public static void main(String[] args) {
		SpringApplication.run(SwaggerUiApplication.class, args);
	}

}
