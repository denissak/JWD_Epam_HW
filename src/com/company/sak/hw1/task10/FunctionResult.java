package com.company.sak.hw1.task10;

import com.company.sak.hw1.userinput.PositiveException;
import com.company.sak.hw1.userinput.Validator;



public class FunctionResult {
    private double a;
    private double b;
    private double h;
    private double value = 0;
    private int count = 0;
    private double f = 0;

    public void calculate(double a, double b, double h) {
        if (Validator.isPositive(a) && Validator.isPositive(b) && Validator.isPositive(h)) {
            while (value < b) {
                value = a + count * h;
                f = Math.tan(value);
                System.out.println(value + " " + f);
                count++;
            }
        }
    }
}
