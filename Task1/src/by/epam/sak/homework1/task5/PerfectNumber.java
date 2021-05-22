package by.epam.sak.homework1.task5;

class PerfectNumber {
    static boolean isNumPerfect(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}
