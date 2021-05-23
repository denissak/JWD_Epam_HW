package by.epam.sak.homework1.task4;

import by.epam.sak.homework1.userinput.UserInput;

public class Main {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        System.out.println("Введите число А");
        double numberA = userInput.pickDouble();
        System.out.println("Введите число B");
        double numberB = userInput.pickDouble();
        System.out.println("Введите число C");
        double numberC = userInput.pickDouble();
        System.out.println("Введите число D");
        double numberD = userInput.pickDouble();
        EvenNumbers numbers = new EvenNumbers();
        System.out.println(numbers.checkNumbers(numberA,numberB,numberC,numberD));
    }
}
