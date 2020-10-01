package com.example.holiday.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.holiday.DTO.Holiday;
import com.example.holiday.model.EmailTemplate;
import com.example.holiday.repo.HolidayServiceProxy;
import com.example.holiday.service.EmailService;

@RestController
@RequestMapping("/holidaynoti")
public class HolidayNotifController {

	@Autowired
	HolidayServiceProxy holidayServiceProxy;

	@Autowired
	EmailService emailService;

	/*
	 * @GetMapping("/get") public List<Holiday> getHoliday() { List<Holiday>
	 * holidays = holidayServiceProxy.findHolidayList(); return holidays; }
	 */

	@PostMapping(value = "/sendmail", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String sendEmail(@RequestBody EmailTemplate emailTemplate) {
		String textEmail = emailService.sendTextEmail(emailTemplate);
		return textEmail;
	}

}
