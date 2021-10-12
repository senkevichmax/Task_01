package by.epamtc.senkevichmaxim.task0104.runner;

import by.epamtc.senkevichmaxim.task0104.util.Logic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("-> ");
        int a = scanner.nextInt();
        System.out.print("-> ");
        int b = scanner.nextInt();
        System.out.print("-> ");
        int c = scanner.nextInt();
        System.out.print("-> ");
        int d = scanner.nextInt();
        System.out.println(Logic.parityCheck(a, b, c, d));
    }

}
