package com.company.sak.hw1.userinput;

public class PositiveException extends Exception{
    public PositiveException() {
        super("Введите положительное число");
    }

    public PositiveException(String message) {
        super(message);
    }

    public PositiveException(String message, Throwable cause) {
        super(message, cause);
    }

    public PositiveException(Throwable cause) {
        super(cause);
    }
}
