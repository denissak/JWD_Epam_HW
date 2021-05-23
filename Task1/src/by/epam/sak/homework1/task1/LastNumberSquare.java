package by.epam.sak.homework1.task1;

class LastNumberSquare {
    private int number;
    public LastNumberSquare(){}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    int lastNumberSquare(int number) {
        return (number % 10 * number % 10) % 10;
    }
}
