package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату x1");
        checkError("Вы ввели не число. Повторите", scanner);
        double x1 = scanner.nextInt();
        System.out.println("Введите координату y1");
        checkError("Вы ввели не число. Повторите", scanner);
        double y1 = scanner.nextInt();
        System.out.println("Введите координату x2");
        checkError("Вы ввели не число. Повторите", scanner);
        double x2 = scanner.nextInt();
        System.out.println("Введите координату y2");
        checkError("Вы ввели не число. Повторите", scanner);
        double y2 = scanner.nextInt();
        CompareDots dots = new CompareDots();
        dots.Compare(x1, y1, x2, y2);
    }

    static void checkError(String message, Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.err.println("Вы ввели не число. Повторите");
            scanner.next();
        }
    }
}
