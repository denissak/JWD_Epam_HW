package com.company.sak.hw1.userinput;

public class Validator {

    public static boolean isPositive(int number){
        return number > 0;
    }

    public static boolean isPositive(double number){
        return number > 0;
    }

    public static boolean isMonthRange(int number){
        return number > 0 && number < 13;
    }

}
