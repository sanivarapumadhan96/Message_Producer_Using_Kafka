package com.example.apachekafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apachekafka.model.Employee;
import com.example.apachekafka.service.KafkaService;

@RestController
@RequestMapping("/kafka")
public class Controller {
	
	@Autowired
	private KafkaService kafkaService;
	
	@PostMapping("/add-details")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee){
		
		String response = kafkaService.sendMessage(employee);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
}
