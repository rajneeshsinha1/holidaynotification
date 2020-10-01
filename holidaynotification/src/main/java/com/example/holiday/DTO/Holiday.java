package com.example.holiday.DTO;



public class Holiday {

	private String month;
	private String date;
	private String day;
	private String occasion;

	
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
		return "Holiday [month=" + month + ", date=" + date + ", day=" + day + ", occasion=" + occasion
				+ "]";
	}

	
}
