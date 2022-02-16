package com.legatohealth.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("FIRSTAPP/api/user")
public interface Client {
	@GetMapping
	public String invokeFirstApp();

}
