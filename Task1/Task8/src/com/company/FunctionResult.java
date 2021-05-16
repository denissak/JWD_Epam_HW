package com.company;

public class FunctionResult {
    private double f = 0;

    void calculate(double x) {
        if (x >= 3) {
            f = -(Math.pow(x, 2)) + (3 * x) + 9;
            System.out.println(f);
        } else if (x < 3) {
            f = 1 / (Math.pow(x, 3) - 6);
            System.out.println(f);
        }
    }
}
