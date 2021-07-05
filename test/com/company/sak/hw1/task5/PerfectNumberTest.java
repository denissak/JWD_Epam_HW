package com.company.sak.hw1.task5;

import org.junit.Test;

import static org.junit.Assert.*;

public class PerfectNumberTest {

    private PerfectNumber value = new PerfectNumber();

    private void assertEqualsExpected(boolean expected, int number) {
        boolean actual = value.isNumPerfect(number);
        assertEquals(expected, actual);
    }

    @Test
    public void testNumPerfect_IsTrue() {
        boolean expected = true;
        int actual = 6;
        assertEqualsExpected(expected,actual);
    }

    @Test
    public void testNumPerfect_IsFalse() {
        boolean expected = false;
        int actual = 191;
        assertEqualsExpected(expected,actual);
    }
}