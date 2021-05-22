package by.epam.sak.homework1.task9;

import by.epam.sak.homework1.userinput.UserInput;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        System.out.println("Введите радиус окружности");
        double radius = userInput.pickPositiveDouble();
        System.out.println("Длина окружности равна " + Calculate.getCircleLength(radius));
        System.out.println("Площадь круга равна " + Calculate.getCircleArea(radius));
    }
}
