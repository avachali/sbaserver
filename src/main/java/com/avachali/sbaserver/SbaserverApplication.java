package com.avachali.sbaserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SbaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbaserverApplication.class, args);
	}

}
