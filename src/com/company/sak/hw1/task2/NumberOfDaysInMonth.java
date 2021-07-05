package com.company.sak.hw1.task2;

public class NumberOfDaysInMonth {

    public int numberOfDaysInMonth(int year, int month) {
        int step = 4;
        int conditionOne = 100;
        int conditionTwo = 400;
        int days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if (year % conditionOne == 0 && year % conditionTwo == 0 || year % step == 0 && year % conditionOne > 0) {
                    days = 29;
                } else
                    days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
        }
        return days;
    }

}
