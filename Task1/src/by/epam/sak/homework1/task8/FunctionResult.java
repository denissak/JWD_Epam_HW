package by.epam.sak.homework1.task8;

class FunctionResult {
    private double x;

    public FunctionResult() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    double calculate(double x) {
        double f = 0;
        if (x >= 3) {
            f = -(Math.pow(x, 2)) + (3 * x) + 9;
        } else if (x < 3) {
            f = 1 / (Math.pow(x, 3) - 6);
        }
        return f;
    }
}
