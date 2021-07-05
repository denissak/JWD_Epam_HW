
package com.company.sak.hw1.task9;

import com.company.sak.hw1.userinput.PositiveException;
import com.company.sak.hw1.userinput.UserInput;

public class Main {
    public static void main(String[] args) throws PositiveException {
        UserInput userInput = new UserInput();
        System.out.println("Введите радиус окружности");
        double radius = userInput.pickPositiveDouble();
        Calculate result = new Calculate();
        System.out.println("Длина окружности " + result.getCircleLength(radius));
        System.out.println("Плоащь круга " + result.getCircleArea(radius));
    }
}
