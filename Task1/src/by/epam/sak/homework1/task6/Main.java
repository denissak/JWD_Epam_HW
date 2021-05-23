package by.epam.sak.homework1.task6;

import by.epam.sak.homework1.userinput.UserInput;

public class Main {

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        System.out.println("Введите число");
        int second = userInput.pickPositiveInt();
        Timer time = new Timer();
        System.out.println(time.getTime(second));
    }
}
