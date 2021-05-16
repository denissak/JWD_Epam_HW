package com.company.task1;

class LastNumberSquare {

    int value;

    void lastNumberSquare(int number) {
        value = (number % 10 * number % 10) % 10;
        System.out.println("Ваше число " + value);
    }
}
