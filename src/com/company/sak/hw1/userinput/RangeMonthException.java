package com.company.sak.hw1.userinput;

public class RangeMonthException extends Exception {
    public RangeMonthException() {
        super("Введите корректный диапазон месяца от 1 до 12");
    }

    public RangeMonthException(String message) {
        super(message);
    }

    public RangeMonthException(String message, Throwable cause) {
        super(message, cause);
    }

    public RangeMonthException(Throwable cause) {
        super(cause);
    }
}
