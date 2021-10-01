package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();

        if(month == 4 || month == 6 || month == 9 || month == 11)
            System.out.println("30 дней");

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            System.out.println("31 день");

        if(month == 2){
            if (year %100==0 && year %400 ==0 )
                System.out.println("29 дней");

            else if (year % 4 == 0 && year % 100 > 0)
                System.out.println("29 дней");

            else if (year % 100 == 0)
                System.out.println("28 дней");

            else
                System.out.println("28 дней");
        }

    }
}
