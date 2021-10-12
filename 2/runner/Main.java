package by.epamtc.senkevichmaxim.task0102.runner;

import java.util.Scanner;

import static by.epamtc.senkevichmaxim.task0102.util.Logic.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();

        countOfDays(month,year);
    }
}
