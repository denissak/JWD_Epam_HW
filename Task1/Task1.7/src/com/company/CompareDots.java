package com.company;

public class CompareDots {
    void Compare(double x1, double y1, double x2, double y2) {
        if (x1 * x1 + y1 * y1 < x2 * x2 + y2 * y2) {
            System.out.println("Точка А ближе");
        } else if ((x1 * x1 + y1 * y1 > x2 * x2 + y2 * y2))
            System.out.println("Точка B ближе");
        else
            System.out.println("Точки А и B находятся на одинаковом расстоянии");
    }
}
