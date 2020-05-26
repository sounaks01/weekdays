package com.ss.demo.model;

import java.time.LocalDateTime;

public class WeekDays {

	private String dayOfWeek;
	
	private LocalDateTime currentTime;
	
	private LocalDateTime oneDayPluscurrentTime;
	
	private LocalDateTime twoDayPluscurrentTime;
	
	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public LocalDateTime getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(LocalDateTime currentTime) {
		this.currentTime =  currentTime;
	}

	public LocalDateTime getOneDayPluscurrentTime() {
		return oneDayPluscurrentTime;
	}

	public void setOneDayPluscurrentTime(LocalDateTime oneDayPluscurrentTime) {
		this.oneDayPluscurrentTime = oneDayPluscurrentTime;
	}

	public LocalDateTime getTwoDayPluscurrentTime() {
		return twoDayPluscurrentTime;
	}

	public void setTwoDayPluscurrentTime(LocalDateTime twoDayPluscurrentTime) {
		this.twoDayPluscurrentTime = twoDayPluscurrentTime;
	}


	
}
