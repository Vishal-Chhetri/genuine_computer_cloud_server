package com.computer.genuine.genuine_computer_cloud_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class GenuineComputerCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenuineComputerCloudServerApplication.class, args);
	}
}
