package com.devsuperior.integration.services;

import com.devsuperior.integration.dto.EmailDto;

public interface EmailService {
	
	void sendEmail(EmailDto dto);

}
