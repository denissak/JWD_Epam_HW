package com.company.sak.hw1.task8;

public class FunctionResult {

    public double calculate(double value) {
        double f = 0;
        if (value >= 3) {
            f = -(Math.pow(value, 2)) + (3 * value) + 9;
        } else if (value < 3) {
            f = 1 / (Math.pow(value, 3) - 6);
        }
        return f;
    }
}
