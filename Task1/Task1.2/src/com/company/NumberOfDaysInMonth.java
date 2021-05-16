package com.company;

public class NumberOfDaysInMonth {
    void numberOfDaysInMonth(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В вашем месяце 31 день");
                break;
            case 2:
                if (year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 > 0) {
                    System.out.println("В вашем месяце 29 дней");
                } else
                    System.out.println("В вашем месяце 28 дней");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В вашем месяце 30 дней");
        }
    }
}
