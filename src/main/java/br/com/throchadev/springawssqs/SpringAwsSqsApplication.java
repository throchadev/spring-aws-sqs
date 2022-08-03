package br.com.throchadev.springawssqs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringAwsSqsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAwsSqsApplication.class, args);
	}

}
