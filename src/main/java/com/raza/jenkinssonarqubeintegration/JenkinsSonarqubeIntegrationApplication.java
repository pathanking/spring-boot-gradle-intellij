package com.raza.jenkinssonarqubeintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinsSonarqubeIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsSonarqubeIntegrationApplication.class, args);
	}

	@RequestMapping("/")
	public String greetings(){
		return "Greetings From Spring Boot Intellij Idea!!";
	}
}
