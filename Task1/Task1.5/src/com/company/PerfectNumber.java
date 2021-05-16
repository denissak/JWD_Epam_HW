package com.company;

public class PerfectNumber {
    public void perfectNumber(int number) {
        if (isNumPerfect(number)) {
            System.out.println(number + " Это совершенное число");
        } else
            System.out.println(number + " Это не совершенное число");
    }

    public static boolean isNumPerfect(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}
