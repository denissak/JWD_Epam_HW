package com.company.sak.hw1.task3;

import com.company.sak.hw1.userinput.PositiveException;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcSquareTest {

    private CalcSquare result = new CalcSquare();

    private void assertEqualsExpected(double expected, double value) throws PositiveException {
        double actual = result.calcSquare(value);
        assertEquals(expected, actual, 0.01d);
    }

    @Test
    public void testCalcSquare_PositiveValue() throws PositiveException {
        double expected = 2;
        double actual = 4;
        assertEqualsExpected(expected, actual);
    }
}