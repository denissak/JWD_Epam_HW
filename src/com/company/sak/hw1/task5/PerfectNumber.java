package com.company.sak.hw1.task5;

public class PerfectNumber{

    public boolean isNumPerfect(int number) {
        int sum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
