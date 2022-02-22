package com.sensefinity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestfulWeatherapisApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWeatherapisApplication.class, args);
	}

}
