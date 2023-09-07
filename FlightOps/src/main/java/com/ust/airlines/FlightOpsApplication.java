package com.ust.airlines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlightOpsApplication {

	public static void main(String[] args) {
	SpringApplication.run(FlightOpsApplication.class, args);
//
//		System.setProperty("javax.net.ssl.trustStore", "/path/to/custom-truststore.jks");
//
//		System.setProperty("javax.net.ssl.trustStorePassword", "your_password");

		System.out.println("Hello Airlines");
	}

}
