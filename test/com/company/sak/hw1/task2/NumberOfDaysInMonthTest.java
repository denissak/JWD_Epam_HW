package com.company.sak.hw1.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfDaysInMonthTest {

    private NumberOfDaysInMonth value = new NumberOfDaysInMonth();

    private void assertEqualsExpected(int expected, int year, int month) {
        int actual = value.numberOfDaysInMonth(year, month);
        assertEquals(expected, actual);
    }

    private void assertValidationFails(int year, int month) {
        int expected = 0;
        assertEqualsExpected(expected, year, month);
    }
    @Test
    public void testNumberOfDaysInMonth_MonthsLessZero() {
        int year = 0;
        int month = -10;
        assertValidationFails(year, month);
    }

    @Test
    public void testNumberOfDaysInMonth_MonthsEqualsZero() {
        int year = 0;
        int month = 0;
        assertValidationFails(year, month);
    }

    @Test
    public void testNumberOfDaysInMonth_MonthsMoreTwelve() {
        int year = 0;
        int month = 13;
        assertValidationFails(year, month);
    }

    @Test
    public void testNumberOfDaysInMonth_MonthsUsualYear() {
        int year = 2013;
        int month = 2;
        int expected = 28;
        assertEqualsExpected(expected, year, month);
    }

    @Test
    public void testNumberOfDaysInMonth_MonthsLeapYear() {
        int year = 2020;
        int month = 2;
        int expected = 29;
        assertEqualsExpected(expected, year, month);
    }
}