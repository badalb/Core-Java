package com.solid.common;

public class MailMessage {

	private String email;

	private String to;

	private String subject;

	public MailMessage(String email, String to, String subject) {
		super();
		this.email = email;
		this.to = to;
		this.subject = subject;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
