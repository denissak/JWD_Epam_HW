package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double squareOuter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите площадь");
        while (!scanner.hasNextDouble()) {
            System.err.println("Вы ввели не число. Повторите");
            scanner.next();
        }
        squareOuter = scanner.nextDouble();
        CalcSquare calc = new CalcSquare();
        calc.calcSquare(squareOuter);
    }
}
