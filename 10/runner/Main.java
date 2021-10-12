package by.epamtc.senkevichmaxim.task0110.runner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а: ");
        double a = scanner.nextDouble();
        System.out.println("Введите b: ");
        double b = scanner.nextDouble();
        System.out.println("Введите h: ");
        double h = scanner.nextDouble();
        double y;

        System.out.println("---------------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
        System.out.println("---------------------------------");
        for(double x = a; x <=b; x = x + h) {
            y = Math.tan(x);
            System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
        }
        System.out.println("---------------------------------");
    }
}
