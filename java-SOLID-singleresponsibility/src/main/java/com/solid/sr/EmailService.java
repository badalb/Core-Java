package com.solid.sr;

import com.solid.common.MailMessage;

public interface EmailService {

	public boolean validateEmail(String email);

	public void sendEmail(MailMessage mailMessage);

}
