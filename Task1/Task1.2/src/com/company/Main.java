package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        checkError("Вы ввели не год. Повторите", scanner);
        year = scanner.nextInt();
        do {
            System.out.println("Введите номер месяца");
            checkError("Это не номер месяца. Повторите", scanner);
            month = scanner.nextInt();
        } while (month > 13);
        NumberOfDaysInMonth numbers = new NumberOfDaysInMonth();
        numbers.numberOfDaysInMonth(year, month);
    }

    static void checkError(String message, Scanner scanner) {
        while (!scanner.hasNextInt()) {
            if (message.equals("Это не номер месяца. Повторите")) {
                System.err.println("Это не номер месяца. Повторите");
            } else {
                System.err.println("Вы ввели не год. Повторите");
            }
            scanner.next();
        }
    }
}
