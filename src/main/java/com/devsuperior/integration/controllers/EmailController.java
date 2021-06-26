package com.devsuperior.integration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.integration.dto.EmailDto;
import com.devsuperior.integration.services.EmailService;

@RestController
@RequestMapping(value = "/emails")
public class EmailController {
	
	@Autowired
	private EmailService service;
	
	@PostMapping
	public ResponseEntity<Void> send(@RequestBody EmailDto dto) {
		service.sendEmail(dto);
		return ResponseEntity.noContent().build();
	}

}
