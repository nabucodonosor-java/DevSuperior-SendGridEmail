package com.devsuperior.integration.services;

import org.slf4j.Logger;

import com.devsuperior.integration.dto.EmailDto;

public class MockEmailService implements EmailService {

	private static Logger LOG = org.slf4j.LoggerFactory.getLogger(MockEmailService.class);

	public void sendEmail(EmailDto dto) {
		
		LOG.info("Sending email to: " + dto.getTo());		
		LOG.info("Email send! Status");
		
	}

}
