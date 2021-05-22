package by.epam.sak.homework1.task1;

import by.epam.sak.homework1.userinput.UserInput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число");
        UserInput userInput = new UserInput();
        int number = userInput.pickInt();
        System.out.println("Последняя цифра квадрата вашего числа " + LastNumberSquare.lastNumberSquare(number));
    }
}
