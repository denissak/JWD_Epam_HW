package com.company.sak.hw1.task9;

import com.company.sak.hw1.userinput.PositiveException;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {

    Calculate result = new Calculate();

    private void assertEqualsArea(double expected, double value) throws PositiveException {
        double actual = result.getCircleArea(value);
        assertEquals(expected, actual, 0.01d);
    }

    private void assertEqualsLength(double expected, double value) throws PositiveException {
        double actual = result.getCircleLength(value);
        assertEquals(expected, actual, 0.01d);
    }


    @Test
    public void testGetCircleLength() throws PositiveException {
        double expected = 62.83;
        double actual = 10;
        assertEqualsLength(expected, actual);
    }

    @Test
    public void testGetCircleArea() throws PositiveException {
        double expected = 314.15;
        double actual = 10;
        assertEqualsArea(expected, actual);
    }

}