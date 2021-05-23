package by.epam.sak.homework1.task2;

class NumberOfDaysInMonth {
    private int year;
    private int month;

    public NumberOfDaysInMonth() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 0) {
            this.year = year;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        }
    }

    int numberOfDaysInMonth(int year, int month) {
        int days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if (year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 > 0) {
                    days = 29;
                } else
                    days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
        }
        return days;
    }
}
