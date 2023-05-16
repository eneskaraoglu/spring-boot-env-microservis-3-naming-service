package com.eneskaraoglu.naming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Micro3Naming {

	public static void main(String[] args) {
		SpringApplication.run(Micro3Naming.class, args);
	}

}
