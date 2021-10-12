package by.epamtc.senkevichmaxim.task0106.runner;

import java.util.Scanner;

import static by.epamtc.senkevichmaxim.task0106.util.Logic.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество секунд: ");

        int numberOfSeconds = scanner.nextInt();
        int hour = 0;
        int min = 0;
        int sec = 0;
        int numberOfSeconds2;
        numberOfSeconds2 = numberOfSeconds;

        time(numberOfSeconds, numberOfSeconds2, hour, min, sec);
    }
}
