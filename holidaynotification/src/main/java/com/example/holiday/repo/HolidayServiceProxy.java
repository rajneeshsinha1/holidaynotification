package com.example.holiday.repo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.holiday.DTO.Holiday;

@FeignClient(name = "holiday", url = "http://localhost:8081/holiday")
public interface HolidayServiceProxy {
	
	@GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Holiday> findHolidayList();	

}
