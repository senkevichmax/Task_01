package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите R:");

        double r = scanner.nextDouble();

        double c = 2*3.14*r;
        double s = 3.14*r*r;

        System.out.println("Длина окружности: " + c + "\nПлощадь круга: " + s);

    }
}
