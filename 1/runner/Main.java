package by.epamtc.senkevichmax.task0101.runner;

import java.util.Scanner;

import static by.epamtc.senkevichmax.task0101.util.Logic.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int number = scanner.nextInt();
        int square = square(number);
        int lastNum = lastNum(square);


        System.out.println("Последняя цифра квадрата: " + lastNum);

    }
}
