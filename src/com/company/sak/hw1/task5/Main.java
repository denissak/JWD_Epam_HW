
package com.company.sak.hw1.task5;

import com.company.sak.hw1.userinput.UserInput;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        System.out.println("Введите число");
        int number = userInput.pickInt();
        PerfectNumber perfectNumber = new PerfectNumber();
        System.out.println("Условие выполнения задачи " + perfectNumber.isNumPerfect(number));
    }
}
