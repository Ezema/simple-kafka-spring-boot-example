package com.example.kafka_microservices;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaMicroservicesApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> template) {
		return args -> {
			for (int i = 1; i <= 100; i++) {
				template.send("sampleTopic", "hello Kafka!, this is message: " + i);
			}

		};
	}

}