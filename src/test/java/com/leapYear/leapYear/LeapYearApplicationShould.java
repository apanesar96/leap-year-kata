package com.leapYear.leapYear;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class LeapYearApplicationShould {

	private LeapYearApplication target;

	@BeforeEach
	void setUp() {
		target = new LeapYearApplication();
	}

	@ParameterizedTest
	@CsvSource({ "1988", "1996", "2004" })

	void validate_leap_years(int year) {
		assertTrue(target.isLeapYear(year));
	}

	@Test
	void validate_1997_as_not_a_leap_year() {
		assertFalse(target.isLeapYear(1997));
	}

}
