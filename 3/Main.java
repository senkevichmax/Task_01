package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите площадь заданного квадрата:");

        double s1 = scanner.nextDouble();
        double d = Math.sqrt(s1);
        double s2 = d*d/2;
        double difference = s1/s2;

        System.out.println("Площадь вписанного квадрата: " + s2);
        System.out.println("Разница площадей квадратов: " + difference);
    }
}
