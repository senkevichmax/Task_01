package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int x = scanner.nextInt();

        int a = x%10;
        int b = a*a;
        int c = b%10;

        System.out.println("Последняя цифра: " + c);

    }
}
