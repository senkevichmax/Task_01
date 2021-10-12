package by.epamtc.senkevichmaxim.task0105.runner;

import java.util.Scanner;

import static by.epamtc.senkevichmaxim.task0105.util.Logic.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.println(isPerfectNumber(number));
    }
}
