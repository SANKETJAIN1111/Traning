package com.legatohealth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
@EnableResourceServer
@EnableEurekaClient

public class SpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}
@GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
public Map<String, Object> user(OAuth2Authentication auth) {
	Map<String, Object>userInfoMap = new HashMap<String, Object>();
	userInfoMap.put("user", auth.getUserAuthentication().getPrincipal());
	userInfoMap.put("authorities", auth.getUserAuthentication().getAuthorities());
	return userInfoMap;
	
}

}
