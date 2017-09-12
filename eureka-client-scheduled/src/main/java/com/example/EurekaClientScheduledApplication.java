package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableDiscoveryClient
@SpringBootApplication
@EnableScheduling
@Configuration
public class EurekaClientScheduledApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientScheduledApplication.class, args);
	}
}
