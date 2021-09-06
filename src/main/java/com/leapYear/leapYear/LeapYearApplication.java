package com.leapYear.leapYear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeapYearApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeapYearApplication.class, args);
	}

	public boolean isLeapYear(int year) {
		if(year % 4 == 0) return true;

		return false;
	}
}
