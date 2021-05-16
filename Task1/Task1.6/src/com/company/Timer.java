package com.company;

public class Timer {
    int hours;
    int minutes;
    int seconds;

    void getTime(int number) {
        hours = number / 3600;
        minutes = (number - hours * 3600) / 60;
        seconds = number - hours * 3600 - minutes * 60;
        System.out.println("Прошло " + hours + " часов " + minutes + " минут " + seconds + " секунд");
    }
}
