package com.example.holiday.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.holiday.DTO.Holiday;
import com.example.holiday.model.EmailTemplate;
import com.example.holiday.repo.HolidayServiceProxy;
import com.google.gson.Gson;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	@Autowired
	HolidayServiceProxy holidayProxyService;

	/*
	 * @Value("$(email.address)") private String attachEmailAddr;
	 */

	public String sendTextEmail(EmailTemplate emailTemplate) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		try {
			if (emailTemplate.getSendTo().contains(",")) {
				String[] emails = emailTemplate.getSendTo().split(",");
				int toSize = emails.length;
				for (int i = 0; i < toSize; i++) {

					mailMessage.setTo(emails[i]);
					List<Holiday> holidays = holidayProxyService.findHolidayList();
					String holidayStr = new Gson().toJson(holidays);
					mailMessage.setText(holidayStr);
					javaMailSender.send(mailMessage);

				}
			} else {
				mailMessage.setTo(emailTemplate.getSendTo());
				List<Holiday> holidays = holidayProxyService.findHolidayList();
				mailMessage.setSubject(emailTemplate.getSubject());
				String holidayStr = new Gson().toJson(holidays);
				mailMessage.setText(holidayStr);
				javaMailSender.send(mailMessage);
			}
		} catch (Exception e) {
			System.out.println("Exception occured");
		}
		return "Email Sent";
	}
}
