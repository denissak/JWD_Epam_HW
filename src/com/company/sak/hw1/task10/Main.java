
package com.company.sak.hw1.task10;

import com.company.sak.hw1.userinput.UserInput;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        System.out.println("Введите число a");
        double numbA = userInput.pickPositiveDouble();
        System.out.println("Введите число b");
        double numbB = userInput.pickPositiveDouble();
        System.out.println("Введите шаг h");
        double numbH = userInput.pickPositiveDouble();
        FunctionResult functionResult = new FunctionResult();
        functionResult.calculate(numbA, numbB, numbH);
    }
}
