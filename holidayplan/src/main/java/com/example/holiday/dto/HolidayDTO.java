package com.example.holiday.dto;

import java.util.Date;

public class HolidayDTO {

	private String month;
	private Date date;
	private String day;
	private String occasion;

	public HolidayDTO() {
	}

	public HolidayDTO(String month, Date date, String day, String occasion) {
		this.month = month;
		this.date = date;
		this.day = day;
		this.occasion = occasion;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
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
		return "HolidayDTO [month=" + month + ", date=" + date + ", day=" + day + ", occasion=" + occasion + "]";
	}

}
