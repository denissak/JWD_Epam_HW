package by.epam.sak.homework1.task7;

class CompareDots {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public CompareDots() {
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        if (x1 > 0) {
            this.x1 = x1;
        }
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        if (y1 > 0) {
            this.y1 = y1;
        }
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        if (x2 > 0) {
            this.x2 = x2;
        }
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        if (y2 > 0) {
            this.y2 = y2;
        }
    }

    String Compare(double x1, double y1, double x2, double y2) {
        double A = x1 * x1 + y1 * y1;
        double B = x2 * x2 + y2 * y2;
        if (A < B) {
            return "Точка А ближе";
        } else if (A > B)
            return ("Точка B ближе");
        else
            return "Точки А и B находятся на одинаковом расстоянии";
    }
}
