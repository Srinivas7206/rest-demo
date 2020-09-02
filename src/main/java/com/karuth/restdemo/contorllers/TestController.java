package com.karuth.restdemo.contorllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

	@GetMapping("/message")
	public ResponseEntity<String>getMessage(){
		//Changes
		String message = "Hello, World";
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
}
