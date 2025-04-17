package com.sblearn.learningcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.sblearn.test", "com.sblearn.learningcore"})

public class LearningcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningcoreApplication.class, args);
	}

}
