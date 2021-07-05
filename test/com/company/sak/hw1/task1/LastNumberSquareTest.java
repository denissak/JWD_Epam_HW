package com.company.sak.hw1.task1;


import static org.junit.Assert.*;

import org.junit.Test;

public class LastNumberSquareTest {

    private LastNumberSquare ls = new LastNumberSquare();

    private void assertEqualsValueInt(int expected, int number) {
        int actual = ls.calculate(number);
        assertEquals(expected, actual);
    }

    @Test
    public void calculate_PositiveNumber() {
        int value = 13;
        int expected = 9;
        assertEqualsValueInt(expected, value);
    }

    @Test
    public void calculate_NegativeNumber() {
        int value = -25;
        int expected = 5;
        assertEqualsValueInt(expected, value);
    }

    @Test
    public void calculate_Zero() {
        int value = 0;
        int expected = 0;
        assertEqualsValueInt(expected, value);
    }

}