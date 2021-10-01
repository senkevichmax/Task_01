package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("x1 = ");
        int x1 = scanner.nextInt();
        System.out.println("y1 = ");
        int y1 = scanner.nextInt();
        System.out.println("x2 = ");
        int x2 = scanner.nextInt();
        System.out.println("y2 = ");
        int y2 = scanner.nextInt();
        if(findLength(x1,y1 ) < findLength(x2,y2))
            System.out.println("A(" + x1 + "; " + y1 + ")");
        else System.out.println("B(" + x2 + "; " + y2 + ")");
    }

    public static double findLength(int x, int y){

        double length = Math.sqrt( x*x + y*y);

        return length;
    }
}