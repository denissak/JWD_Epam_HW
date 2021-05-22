package by.epam.sak.homework1.task7;

class CompareDots {

    static String Compare(double x1, double y1, double x2, double y2) {
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
