package com.devsuperior.integration.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.integration.dto.EmailDto;

@RestController
@RequestMapping(value = "/emails")
public class EmailController {
	
	@PostMapping
	public ResponseEntity<Void> send(@RequestBody EmailDto dto) {
		return ResponseEntity.noContent().build();
	}

}
