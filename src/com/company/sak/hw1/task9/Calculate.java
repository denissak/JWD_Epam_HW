package com.company.sak.hw1.task9;

import com.company.sak.hw1.userinput.PositiveException;
import com.company.sak.hw1.userinput.Validator;

public class Calculate {

    public double getCircleLength(double radius) throws PositiveException {
        if (Validator.isPositive(radius)) {
            return 2 * radius * Math.PI;
        } else throw new PositiveException();
    }

    public double getCircleArea(double radius) throws PositiveException {
        if (Validator.isPositive(radius)) {
            return Math.pow(radius, 2) * Math.PI;
        } else throw new PositiveException();
    }
}
