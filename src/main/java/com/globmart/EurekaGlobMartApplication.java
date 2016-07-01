package com.globmart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaGlobMartApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaGlobMartApplication.class, args);
	}
}
