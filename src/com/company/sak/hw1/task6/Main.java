
package com.company.sak.hw1.task6;

import com.company.sak.hw1.userinput.PositiveException;
import com.company.sak.hw1.userinput.UserInput;

public class Main {
    public static void main(String[] args) throws PositiveException {
        UserInput userInput = new UserInput();
        System.out.println("Введите число");
        int second = userInput.pickPositiveInt();
        Timer time = new Timer();
        System.out.println(time.calcCurrentTime(second));
    }
}
