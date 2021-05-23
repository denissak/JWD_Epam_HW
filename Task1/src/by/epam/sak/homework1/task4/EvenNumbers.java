package by.epam.sak.homework1.task4;

class EvenNumbers {
    private double numbA;
    private double numbB;
    private double numbC;
    private double numbD;

    public EvenNumbers(){}

    public double getNumbA() {
        return numbA;
    }

    public void setNumbA(double numbA) {
        this.numbA = numbA;
    }

    public double getNumbB() {
        return numbB;
    }

    public void setNumbB(double numbB) {
        this.numbB = numbB;
    }

    public double getNumbC() {
        return numbC;
    }

    public void setNumbC(double numbC) {
        this.numbC = numbC;
    }

    public double getNumbD() {
        return numbD;
    }

    public void setNumbD(double numbD) {
        this.numbD = numbD;
    }

    boolean checkNumbers(double numbA, double numbB, double numbC, double numbD) {
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
