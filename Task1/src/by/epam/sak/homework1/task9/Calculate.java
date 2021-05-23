package by.epam.sak.homework1.task9;

class Calculate {
    private double radius;

    public Calculate() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    double getCircleLength(double radius) {
        return 2 * radius * Math.PI;
    }

    double getCircleArea(double radius) {
        return Math.pow(radius, 2) * Math.PI;
    }
}
