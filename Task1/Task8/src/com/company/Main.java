package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x");
        while (!scanner.hasNextDouble()) {
            System.err.println("Вы ввели число. Повторите");
            scanner.next();
        }
        double numbX = scanner.nextDouble();
        FunctionResult result = new FunctionResult();
        result.calculate(numbX);
    }
}
