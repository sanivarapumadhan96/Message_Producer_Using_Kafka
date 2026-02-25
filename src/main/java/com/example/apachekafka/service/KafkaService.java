package com.example.apachekafka.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.kafka.core.KafkaTemplate;

import com.example.apachekafka.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

	@Autowired
	private KafkaTemplate<String, Employee> kafkaTemplate;
	
	public String sendMessage(Employee employee) {
		
		kafkaTemplate.send("Mounika", "Employee", employee);
		return "Madhan sending a message that Hi Mounika Have a Nice Day";
	}
}
