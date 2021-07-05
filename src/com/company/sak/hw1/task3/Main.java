
package com.company.sak.hw1.task3;

import com.company.sak.hw1.userinput.PositiveException;
import com.company.sak.hw1.userinput.UserInput;

public class Main {
    public static void main(String[] args) throws PositiveException {
        UserInput userInput = new UserInput();
        System.out.println("Введите площадь");
        double square = userInput.pickPositiveDouble();
        CalcSquare calcSquare = new CalcSquare();
        System.out.println("Площадь квадрата вписанного в окружность равна " + calcSquare.calcSquare(square));
    }
}
