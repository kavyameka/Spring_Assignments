package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Assignment456Application {
	//Assignment 4
	public static void main(String[] args) {
		SpringApplication.run(Assignment456Application.class, args);
		//Assignment-4
		System.out.println("Hello World");
	}
	//Assignment 5
	@RequestMapping(value = "/test")
	public ResponseEntity<Object> testMethod() { 
		Map<String, String> data = new HashMap();
        data.put("key1", "value1");
        data.put("key2", "value2");
        return new ResponseEntity<>(data, HttpStatus.OK);
	}
	//Assignment 6
	@RequestMapping(value = "/testPost", method = RequestMethod.POST)
	   public ResponseEntity<Object> createProduct(@RequestBody String str) {
	      return new ResponseEntity<>("Test Post mapping", HttpStatus.CREATED);
	   }
	
}
