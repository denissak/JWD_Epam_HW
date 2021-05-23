package by.epam.sak.homework1.task10;

class FunctionResult {
    private double a;
    private double b;
    private double h;
    private double value = 0;
    private int count = 0;
    private double f = 0;

    public FunctionResult() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a > 0) {
            this.a = a;
        }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b > 0) {
            this.b = b;
        }
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        if (h > 0) {
            this.h = h;
        }
    }

    void calculate(double a, double b, double h) {
        while (value < b) {
            value = a + count * h;
            f = Math.tan(value);
            System.out.println(value + " " + f);
            count++;
        }
    }
}

