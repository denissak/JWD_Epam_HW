package by.epam.sak.homework1.task8;

import by.epam.sak.homework1.userinput.UserInput;

public class Main {

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        System.out.println("Введите число x");
        double numbX = userInput.pickDouble();
        System.out.println(FunctionResult.calculate(numbX));
    }
}
