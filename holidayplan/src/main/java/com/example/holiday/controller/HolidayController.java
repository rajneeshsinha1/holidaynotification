package com.example.holiday.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.holiday.model.Holiday;
import com.example.holiday.repository.HolidayRepository;

@RestController
@RequestMapping("/holiday")
public class HolidayController {
	
	@Autowired
	HolidayRepository holidayRepository;
	
	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addHoliday(@RequestBody Holiday holiday) {
		holidayRepository.save(holiday);
		return "holiday added";
	}
	
	@GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Holiday> getAllHoliday() {
		List<Holiday> holidays = holidayRepository.findAll();
		return holidays;
	}
	
	/*
	 * @GetMapping(value = "/get/date/{date}", produces =
	 * MediaType.APPLICATION_JSON_VALUE) public Holiday
	 * getByDateHoliday(@PathVariable(value = "date") String date) { Holiday holiday
	 * = holidayRepository.findByDate(date); System.out.println(holiday);
	 * 
	 * return holiday; }
	 */
	
	@DeleteMapping("/delete/{id}")
	public String deleteHoliday(@PathVariable(value = "id") Long id) {
		
		holidayRepository.deleteById(id);
		
		return "holiday deleted with id: " +id;
		
	}

}
