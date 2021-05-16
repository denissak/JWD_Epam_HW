package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        while (!scanner.hasNextInt()) {
            System.err.println("Вы ввели не число. Повторите");
            scanner.next();
        }
        int number = scanner.nextInt();
        PerfectNumber value = new PerfectNumber();
        value.perfectNumber(number);
    }
}





