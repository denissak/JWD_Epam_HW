package com.company;

public class Calculate {
    void getCircleLength(double radius) {
        double circleLength = 2 * radius * Math.PI;
        System.out.println("Длина окружности равна " + circleLength);
    }

    void getCircleArea(double radius) {
        double circleArea = Math.pow(radius, 2) * Math.PI;
        System.out.println("Площадь круга равна " + circleArea);
    }
}
