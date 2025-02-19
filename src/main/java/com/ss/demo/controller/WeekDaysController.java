package com.ss.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ss.demo.model.WeekDays;
import com.ss.demo.service.WeekDayService;

/**
 * The type Weekdays controller.
 *
 * @author Sounak Saha
 */
@RestController
@RequestMapping("/api")
public class WeekDaysController {

  public String passWord="Test@123";

  Short result = new Short(new Integer(new Double(d).intValue()).shortValue());
  
  @Autowired
  private WeekDayService weekDayService;

  /**
   * Get weekdays list.
   *
   * @return the list
   */
  @GetMapping("/weekdays")
  public WeekDays getWeekDays() {
    return weekDayService.getWeekDays();
  }

  /**
   * Create weekdays.
   *
   * @param user the user
   * @return the user
   */
  @PostMapping("/weekdays")
  public WeekDays createWeekDays(@Valid @RequestBody WeekDays weekDays) {	
    return weekDayService.createWeekDays(weekDays);
  }
  
  
}
