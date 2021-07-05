package com.company.sak.hw1.task6;

import com.company.sak.hw1.userinput.PositiveException;
import com.company.sak.hw1.userinput.Validator;

public class Timer {

    public String calcCurrentTime(int number) throws PositiveException {
        if (Validator.isPositive(number)) {
            int hours = number / 3600;
            int minutes = (number - hours * 3600) / 60;
            int seconds = number - hours * 3600 - minutes * 60;
            return "Прошло " + hours + " часов " + minutes + " минут " + seconds + " секунд";
        } else throw new PositiveException();
    }
}
