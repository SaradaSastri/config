package com.ilearn.resttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateApplication.class, args);
		RestTemplate restTemplate = new RestTemplate();
		String propResourceUrl  = "http://localhost:8888/config-client/development";
		
		/*
		
		ResponseEntity<PropertiesPojo> response = restTemplate.getForEntity(propResourceUrl, PropertiesPojo.class);
		System.out.println(response);
		//assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));*/
		
		PropertiesPojo propertiesPojo = restTemplate.getForObject(propResourceUrl, PropertiesPojo.class);
		System.out.println(propertiesPojo.getName());
		System.out.println("prop=" + propertiesPojo.getAllProperties());
		System.out.println("prop=" + propertiesPojo.getAllProperties().getProperty("password"));
		
	}

}
