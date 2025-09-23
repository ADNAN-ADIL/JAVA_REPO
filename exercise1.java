package com.company;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st sub marks");
        int a = sc.nextInt();
        System.out.println("enter 2nd sub marks");
        int b = sc.nextInt();
        System.out.println("enter 3rd sub marks");
        int c = sc.nextInt();
        System.out.println("enter 4th sub marks");
        int d = sc.nextInt();
        System.out.println("enter 5th sub marks");
        int e = sc.nextInt();
        int sum = a+b+c+d+e;
        float percent = (sum/500.0F)*100;
        System.out.println("percentage: "+percent);

    }
}
