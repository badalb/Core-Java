package com.solid.sr;

import com.solid.common.DatabaseService;
import com.solid.common.MailMessage;
import com.solid.common.User;
import com.solid.common.ValidationException;

public class UserServiceImpl implements UserService {

	private EmailService emailService;

	private DatabaseService databaseService;

	public void Register(String email, String password) throws ValidationException {
		if (!emailService.validateEmail(email))
			throw new ValidationException("Email is not an email!");

		User user = new User(email, password);
		databaseService.save(user);

		emailService.sendEmail(new MailMessage("mysite@nowhere.com", email, "HEllo fool!"));
	}
}
