package by.epamtc.senkevichmaxim.task0109.runner;

import java.util.Scanner;

import static by.epamtc.senkevichmaxim.task0109.util.Logic.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите R:");

        double r = scanner.nextDouble();
        double r2 = r;

        double c = lenghtOf(r);
        double s = squaretOf(r2);

        System.out.println("Длина окружности: " + c + "\nПлощадь круга: " + s);

    }
}
