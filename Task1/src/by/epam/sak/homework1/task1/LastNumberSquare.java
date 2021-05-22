package by.epam.sak.homework1.task1;

class LastNumberSquare {
    static int lastNumberSquare(int number) {
        return (number % 10 * number % 10) % 10;
    }
}
