package by.epam.sak.homework1.task3;

import by.epam.sak.homework1.userinput.UserInput;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        System.out.println("Введите площадь");
        double square = userInput.pickPositiveDouble();
        CalcSquare calcSquare = new CalcSquare();
        System.out.println("Площадь квадрата вписанного в окружность равна " + calcSquare.calcSquare(square));
    }
}
