package com.prashant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoveryRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoveryRegistryApplication.class, args);
	}

}
