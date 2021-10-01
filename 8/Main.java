package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите х: ");

        int x = scanner.nextInt();
        double fx;
        if (x >= 3) {
            fx = -x * x + 3 * x + 9;
        } else {
            fx = 1 / (Math.pow(x, 3) - 6);
        }
        System.out.println("F(x)=" + fx);
    }
}
