package by.epam.sak.homework1.task7;

import by.epam.sak.homework1.userinput.UserInput;

public class Main {

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        System.out.println("Введите координату x1");
        double x1 = userInput.pickPositiveDouble();
        System.out.println("Введите координату y1");
        double y1 = userInput.pickPositiveDouble();
        System.out.println("Введите координату x2");
        double x2 = userInput.pickPositiveDouble();
        System.out.println("Введите координату y2");
        double y2 = userInput.pickPositiveDouble();
        CompareDots dots = new CompareDots();
        System.out.println(dots.Compare(x1,y1,x2,y2));
    }
}
