package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество секунд: ");

        int numberOfSeconds = scanner.nextInt();
        int hour, min, sec;
        int saveNumberOfSeconds;
        saveNumberOfSeconds = numberOfSeconds;
        if ((numberOfSeconds > 86400) || (numberOfSeconds < 0)) {
            System.out.println("Неверное значение.");
            return;
        }
        hour = numberOfSeconds / 3600;
        numberOfSeconds = numberOfSeconds - hour * 3600;
        min = numberOfSeconds / 60;
        numberOfSeconds = numberOfSeconds - min * 60;
        sec = numberOfSeconds;
        System.out.println("В " + saveNumberOfSeconds + " секундах: " +
                hour + " ч. " + min + " мин. " + sec + " сек.");
    }
}
