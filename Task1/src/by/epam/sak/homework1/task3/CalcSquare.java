package by.epam.sak.homework1.task3;

class CalcSquare {
    private double squareOuter;

    public CalcSquare() {
    }

    public double getSquareOuter() {
        return squareOuter;
    }

    public void setSquareOuter(double squareOuter) {
        if (squareOuter > 0) {
            this.squareOuter = squareOuter;
        }
    }

    double calcSquare(double squareOuter) {
        return squareOuter / 2;
    }
}
