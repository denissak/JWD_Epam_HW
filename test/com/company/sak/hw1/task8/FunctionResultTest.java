package com.company.sak.hw1.task8;

import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionResultTest {

    private FunctionResult result = new FunctionResult();

    private void assertEqualsExpected(double expected, double value) {
        double actual = result.calculate(value);
        assertEquals(expected, actual, 0.01d);
    }

    @Test
    public void calculate_PositiveNumberLessThree() {
        double expected = 0.5;
        double actual = 10;
        assertEqualsExpected(expected, actual);
    }

    @Test
    public void calculate_PositiveNumberMoreThree() {
        double expected = 5;
        double actual = 10;
        assertEqualsExpected(expected, actual);
    }

}