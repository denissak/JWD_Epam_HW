package com.company;

public class EvenNumbers {
    void compare(int numbA, int numbB, int numbC, int numbD) {
        int count = 0;
        if (numbA % 2 == 0) {
            count++;
        }
        if (numbB % 2 == 0) {
            count++;
        }
        if (numbC % 2 == 0) {
            count++;
        }
        if (numbD % 2 == 0) {
            count++;
        }
        if (count >= 2) {
            System.out.println(true);
        } else
            System.out.println(false);
    }
}
