package com.viacep.consumo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ConsumoApplication.class, args);
	}
	
	@Bean 
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
