package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус окружности");
        while (!scanner.hasNextDouble()) {
            System.err.println("Вы ввели число. Повторите");
            scanner.next();
        }
        double radius = scanner.nextDouble();
        Calculate value = new Calculate();
        value.getCircleLength(radius);
        value.getCircleArea(radius);
    }
}
