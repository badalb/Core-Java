package com.solid.nsr;

import com.solid.common.DatabaseService;
import com.solid.common.MailMessage;
import com.solid.common.SmtpClient;
import com.solid.common.User;
import com.solid.common.ValidationException;

public class UserService {

	private DatabaseService databaseService;

	private SmtpClient smtpClient;

	public void Register(String email, String password) throws ValidationException {
		if (!email.contains("@"))
			throw new ValidationException("Email is not an email!");

		User user = new User(email, password);
		databaseService.save(user);

		smtpClient.send(new MailMessage("mysite@nowhere.com", email, "HEllo fool!"));
	}
}