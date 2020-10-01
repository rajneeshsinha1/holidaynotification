package com.example.holiday.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Holiday {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String month;
	
	
	private String date;
	private String day;
	private String occasion;

	public Holiday() {
	}

	public Holiday(long id, String month, String date, String day, String occasion) {
		this.id = id;
		this.month = month;
		this.date = date;
		this.day = day;
		this.occasion = occasion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getOccasion() {
		return occasion;
	}

	public void setOccasion(String occasion) {
		this.occasion = occasion;
	}

	@Override
	public String toString() {
		return "Holiday [id=" + id + ", month=" + month + ", date=" + date + ", day=" + day + ", occasion=" + occasion
				+ "]";
	}

	
}
