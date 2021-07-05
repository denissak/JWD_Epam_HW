package com.company.sak.hw1.task7;

import com.company.sak.hw1.userinput.PositiveException;
import com.company.sak.hw1.userinput.Validator;
import org.w3c.dom.ls.LSOutput;

import java.io.Serializable;
import java.util.Objects;

public class CompareDots implements Serializable {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public CompareDots(double x1, double y1, double x2, double y2) {

        if (Validator.isPositive(x1)){
            this.x1 = x1;
        }
        if (Validator.isPositive(y1)){
            this.y1 = y1;
        }
        if (Validator.isPositive(x2)){
            this.x2 = x2;
        }
        if (Validator.isPositive(y2)){
            this.y2 = y2;
        }
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) throws PositiveException {
        if (Validator.isPositive(x1)) {
            this.x1 = x1;
        }else throw new PositiveException();
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) throws PositiveException {
        if (Validator.isPositive(y1)) {
            this.y1 = y1;
        }else throw new PositiveException();
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) throws PositiveException {
        if (Validator.isPositive(x2)) {
            this.x2 = x2;
        }else throw new PositiveException();
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) throws PositiveException {
        if (Validator.isPositive(y2)) {
            this.y2 = y2;
        }else throw new PositiveException();
    }

    private String Compare(double x1, double y1, double x2, double y2) {
        double A = x1 * x1 + y1 * y1;
        double B = x2 * x2 + y2 * y2;
        if (A < B) {
            return "Точка А ближе";
        } else if (A > B)
            return ("Точка B ближе");
        else
            return "Точки А и B находятся на одинаковом расстоянии";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompareDots that = (CompareDots) o;
        return x1 == that.x1 &&
               y1 == that.y1 &&
               x2 == that.x2 &&
               y2 == that.y2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, y1, x2, y2);
    }

    @Override
    public String toString() {
        return Compare(x1,y1,x2,y2);
    }
}
