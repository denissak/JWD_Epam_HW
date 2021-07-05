
package com.company.sak.hw1.task2;

import com.company.sak.hw1.userinput.UserInput;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        System.out.println("Введите год");
        int year = userInput.pickPositiveInt();
        System.out.println("Введите номер месяца");
        int month = userInput.pickMonth();
        NumberOfDaysInMonth days = new NumberOfDaysInMonth();
        System.out.println("В выбранном Вами месяце " + days.numberOfDaysInMonth(year,month) + " дней");
    }

}
