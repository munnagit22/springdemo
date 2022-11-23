package com.practice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping("/message/{name}")
	public ResponseEntity<String> displayMessage(@PathVariable String name)
	{
		return new ResponseEntity<String>("Welcome :"+name,HttpStatus.OK);
	}

}
