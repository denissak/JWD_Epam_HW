package com.company.sak.hw1.userinput;

import java.util.Scanner;

public class UserInput {
    private Scanner scanner = new Scanner(System.in);

    public int pickInt(){
        while (!scanner.hasNextInt()) {
            System.err.println("Вы ввели не число. Повторите");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public double pickDouble(){
        while (!scanner.hasNextDouble()) {
            System.err.println("Вы ввели не число. Повторите");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public int pickPositiveInt(){
        int value = pickInt();
        if(value<0){
            System.err.println("Введите положительное число");
            value = pickPositiveInt();
        }
        return value;
    }

    public double pickPositiveDouble(){
        double value = pickDouble();
        if(value<0){
            System.err.println("Введите положительное число");
            value = pickPositiveDouble();
        }
        return value;
    }

    public int pickMonth(){
        int value = pickPositiveInt();
        if(value>12){
            System.err.println("Не верная цифра месяца");
            value = pickMonth();
        }
        if(value<1){
            System.err.println("Не верная цифра месяца");
            value = pickMonth();
        }
        return value;
    }
}
