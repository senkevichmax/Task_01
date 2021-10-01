package com.company;

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
        System.out.println(parityCheck(a, b, c, d));
    }

    public static boolean parityCheck(int a, int b, int c, int d){

        int check = 0;

        if(a%2 == 0)
            check++;
        if(b%2 == 0)
            check++;
        if(c%2 == 0)
            check++;
        if(d%2 == 0)
            check++;

        if(check>=2)
            return true;
        else return false;
    }
}
