package com.legatohealth.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface Client {
	@GetMapping
	public String invokeFirstApp();

}
