package by.epam.sak.homework1.task4;

class EvenNumbers {
    static boolean checkNumbers(double numbA, double numbB, double numbC, double numbD) {
        double count = 0;
        if (numbA % 2 == 0) {
            count++;
        }
        if (numbB % 2 == 0) {
            count++;
        }
        if (numbC % 2 == 0) {
            count++;
        }
        if (numbD % 2 == 0) {
            count++;
        }
        if (count >= 2) {
            return true;
        } else
            return false;
    }
}
