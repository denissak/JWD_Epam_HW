
package com.company.sak.hw1.task4;

import com.company.sak.hw1.task2.NumberOfDaysInMonth;
import com.company.sak.hw1.userinput.UserInput;

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
        System.out.println("Условие выполнения задачи " + numbers.checkNumbers(numberA,numberB,numberC,numberD));
    }
}
