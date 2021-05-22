package by.epam.sak.homework1.task2;

import by.epam.sak.homework1.userinput.UserInput;

public class Main {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        System.out.println("Введите год");
        int year = userInput.pickPositiveInt();
        System.out.println("Введите номер месяца");
        int month = userInput.pickMonth();
        System.out.println("В выбранном Вами месяце " + NumberOfDaysInMonth.numberOfDaysInMonth(year, month) + " дней");
    }
}