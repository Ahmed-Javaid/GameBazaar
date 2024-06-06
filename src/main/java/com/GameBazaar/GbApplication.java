package com.GameBazaar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GbApplication {

	public static void main(String[] args) {
		SpringApplication.run(GbApplication.class, args);

	}
}
