package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A");
        checkError("Вы ввели не число. Повторите", scanner);
        int numbA = scanner.nextInt();
        System.out.println("Введите число B");
        checkError("Вы ввели не число. Повторите", scanner);
        int numbB = scanner.nextInt();
        System.out.println("Введите число C");
        checkError("Вы ввели не число. Повторите", scanner);
        int numbC = scanner.nextInt();
        System.out.println("Введите число D");
        checkError("Вы ввели не число. Повторите", scanner);
        int numbD = scanner.nextInt();
        EvenNumbers evenNumbers = new EvenNumbers();
        evenNumbers.compare(numbA, numbB, numbC, numbD);
    }

    static void checkError(String message, Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.err.println("Вы ввели не число. Повторите");
            scanner.next();
        }
    }
}
