
package com.company.sak.hw1.task7;

import com.company.sak.hw1.task2.NumberOfDaysInMonth;
import com.company.sak.hw1.userinput.UserInput;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        System.out.println("Введите координату x1");
        double x1 = userInput.pickPositiveDouble();
        System.out.println("Введите координату y1");
        double y1 = userInput.pickPositiveDouble();
        System.out.println("Введите координату x2");
        double x2 = userInput.pickPositiveDouble();
        System.out.println("Введите координату y2");
        double y2 = userInput.pickPositiveDouble();
        CompareDots dots = new CompareDots(x1,y1,x2,y2);
        System.out.println(dots);
    }
}
