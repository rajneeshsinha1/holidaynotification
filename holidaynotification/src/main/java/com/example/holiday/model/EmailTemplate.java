package com.example.holiday.model;

import javax.validation.constraints.Email;

public class EmailTemplate {

	@Email
	private String sendTo;
	private String subject;

	public String getSendTo() {
		return sendTo;
	}

	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
