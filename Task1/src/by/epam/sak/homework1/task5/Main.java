package by.epam.sak.homework1.task5;

import by.epam.sak.homework1.userinput.UserInput;

public class Main {

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        System.out.println("Введите число");
        int number = userInput.pickInt();
        PerfectNumber perfectNumber = new PerfectNumber();
        System.out.println(perfectNumber.isNumPerfect(number));
    }
}





