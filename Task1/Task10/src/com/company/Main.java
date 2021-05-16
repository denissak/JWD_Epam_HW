package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        checkError("Вы ввели не число. Повторите", scanner);
        double numbA = scanner.nextDouble();
        System.out.println("Введите число b");
        checkError("Вы ввели не число. Повторите", scanner);
        double numbB = scanner.nextDouble();
        System.out.println("Введите шаг h");
        checkError("Вы ввели не число. Повторите", scanner);
        double numbH = scanner.nextDouble();
        FunctionResult value = new FunctionResult();
        value.calculate(numbA, numbB, numbH);
    }

    static void checkError(String message, Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.err.println("Вы ввели не число. Повторите");
            scanner.next();
        }
    }
}

