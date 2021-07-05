
package com.company.sak.hw1.task1;

import com.company.sak.hw1.userinput.UserInput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число");
        UserInput userInput = new UserInput();
        int number = userInput.pickInt();
        LastNumberSquare ls = new LastNumberSquare();
        System.out.println("Цифра квадрата последнего числа равна " +ls.calculate(number));
    }
}
