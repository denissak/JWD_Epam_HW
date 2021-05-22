package by.epam.sak.homework1.task6;

class Timer {
    static String getTime(int number) {
        int hours = number / 3600;
        int minutes = (number - hours * 3600) / 60;
        int seconds = number - hours * 3600 - minutes * 60;
        return "Прошло " + hours + " часов " + minutes + " минут " + seconds + " секунд";
    }
}
