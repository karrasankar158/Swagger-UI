package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SwaggerUIRestController {
	/**
	 * URL: http://localhost:9900/test/message
	 * @return
	 */
	@GetMapping("/message")
	public ResponseEntity<String> showMessage(){
		
		return new ResponseEntity
				<String>("Welcome to Spring Boot Rest Programming..", 
				HttpStatus.OK);
	}
	
	@GetMapping("/show/{id}")
	public ResponseEntity<String> show(
			@PathVariable Integer id
			){
		
		return new ResponseEntity
				<String>("Welcome:: "+id, 
				HttpStatus.OK);
	}
	
	@GetMapping("/req")
	public ResponseEntity<String> find(
			@RequestParam Integer id
			){
		
		return new ResponseEntity
				<String>("Welcome:: "+id, 
				HttpStatus.OK);
	}

}
