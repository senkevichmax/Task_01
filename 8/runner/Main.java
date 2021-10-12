package by.epamtc.senkevichmaxim.task0108.runner;

import java.util.Scanner;

import static by.epamtc.senkevichmaxim.task0108.util.Logic.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите х: ");

        double x = scanner.nextInt();
        double fx =function(x);

        System.out.println("F(x)=" + fx);
    }
}
