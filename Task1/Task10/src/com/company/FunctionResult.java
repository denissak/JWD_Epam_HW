package com.company;

public class FunctionResult {
    private double value = 0;
    private int count = 0;
    private double f = 0;

    void calculate(double a, double b, double h) {
        while (value < b) {
            value = a + count * h;
            f = Math.tan(value);
            System.out.println(value + " " + f);
            count++;
        }
    }
}

