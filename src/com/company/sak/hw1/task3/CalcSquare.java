package com.company.sak.hw1.task3;

import com.company.sak.hw1.userinput.PositiveException;
import com.company.sak.hw1.userinput.Validator;


public class CalcSquare{

       public double calcSquare(double squareOuter) throws PositiveException {
        if (Validator.isPositive(squareOuter)) {
            return squareOuter / 2;
        }else throw new PositiveException();
    }
}
