package com.legatohealth.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("microservices-app-3")
public class UserRest {
	private final Logger Log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private RestTemplate restTemplete;
	@GetMapping()
	public String microserviceApp2() {
		Log.info("Microservice App Three UP And Running : " + Log.getName());
		String response = restTemplete.getForObject("http://APP2/microservices-app-2", String.class);
		return "Hello this is MicroserviceApp Three :" + response;
	}

	
}
