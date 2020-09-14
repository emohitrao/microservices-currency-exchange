package com.training.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringConfiguratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfiguratorApplication.class, args);
	}

}
