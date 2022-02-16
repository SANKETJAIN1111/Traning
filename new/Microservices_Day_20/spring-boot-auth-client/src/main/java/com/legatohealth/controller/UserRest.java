package com.legatohealth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("protected-app")
public class UserRest {

	
	@GetMapping(path = "/fetch")
	public String getApi() {
		
		return  "Get Info";
	}
	
	@PostMapping(path ="/store")
public String postApi() {
		
		return  "Post Info";
	}
	
	
//	/*
//	 * Deleting the user by id
//	 */
//	@DeleteMapping(path = "/user/{userId}")
//	public ResponseEntity<Object> deleteUser(@PathVariable("userId") int id) {
//		ResponseEntity<Object> response = null;
//		try {
//			service.deleteUser(id);
//			CustomMessage custom = new CustomMessage("User with an id "+id+" deleted", 200);
//			response = ResponseEntity.status(HttpStatus.OK).body(custom);
//		} catch (UserNotFoundException e) {
//			CustomMessage custom = new CustomMessage(e.getMessage(), 404);
//			response = ResponseEntity.status(HttpStatus.NOT_FOUND).body(custom);
//		}
//		return response;
//	}
//	/*
//	 * Fetch the user by id
//	 */
//	@GetMapping(path = "/user/{userId}")
//	public ResponseEntity<Object> fetchUser(@PathVariable("userId") int id) {
//		ResponseEntity<Object> response = null;
//		try {
//			User getUser=service.fetchUser(id);
//			//CustomMessage custom = new CustomMessage("User with an id "+id+" deleted", 200);
//			response = ResponseEntity.status(HttpStatus.OK).body(getUser);
//		} catch (UserNotFoundException e) {
//			CustomMessage custom = new CustomMessage(e.getMessage(), 404);
//			response = ResponseEntity.status(HttpStatus.NOT_FOUND).body(custom);
//		}
//		return response;
//	}
}
