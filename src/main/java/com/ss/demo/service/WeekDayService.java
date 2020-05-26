package com.ss.demo.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.ss.demo.model.WeekDays;

@Service
public class WeekDayService {
	
	private final static int numberOfDays =7;
	
	/**
	 * 
	 * @return WeekDays
	 */
	public WeekDays getWeekDays() {
		 WeekDays weekDays = new WeekDays();		 
		 LocalDateTime currentTime = LocalDateTime.now();
		 weekDays.setDayOfWeek(createDaysOfWeek(currentTime));
		 weekDays.setCurrentTime(currentTime);
		 currentTime = currentTime.plusDays(1);
		 weekDays.setOneDayPluscurrentTime(currentTime);
		 //Already one added so added only single day
		 currentTime = currentTime.plusDays(1);
		 weekDays.setTwoDayPluscurrentTime(currentTime);
		 return weekDays;
	}

	public WeekDays createWeekDays(final WeekDays weekDays) {
		 WeekDays newWeekDays = new WeekDays();
		 LocalDateTime currentTime = weekDays.getCurrentTime();
		 newWeekDays.setDayOfWeek(createDaysOfWeek(currentTime));
		 newWeekDays.setCurrentTime(currentTime);
		 currentTime = currentTime.plusDays(1);
		 newWeekDays.setOneDayPluscurrentTime(currentTime);
		 //Already one added so added only single day
		 currentTime = currentTime.plusDays(1);
		 newWeekDays.setTwoDayPluscurrentTime(currentTime);
		 return newWeekDays;
	}
	
	/**
	 * 
	 * @param currentTime
	 * @return
	 */
	private String createDaysOfWeek(LocalDateTime currentTime) {
		StringBuilder weekDays = new StringBuilder();
		for(int i=0; i < numberOfDays; i++) {
			weekDays.append(i)
			.append(". ").append(currentTime.toLocalDate().getDayOfWeek().toString())
			.append(",");
			currentTime = currentTime.plusDays(1);
		}
		return weekDays.toString();
	}
}
