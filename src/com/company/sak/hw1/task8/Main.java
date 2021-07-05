
package com.company.sak.hw1.task8;

import com.company.sak.hw1.userinput.UserInput;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        System.out.println("Введите число x");
        double numbX = userInput.pickDouble();
        FunctionResult result = new FunctionResult();
        System.out.println("Значение вашей функции равно " + result.calculate(numbX));
    }
}
