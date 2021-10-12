package by.epamtc.senkevichmaxim.task0103.runner;

import by.epamtc.senkevichmaxim.task0103.util.Logic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите площадь заданного квадрата:");

        double s1 = scanner.nextDouble();
        double s2 = Logic.squareDiiferencce(s1);

        System.out.println("Площадь вписанного квадрата: " + s2);
        System.out.println("Разница площадей квадратов: 2");
    }
}
