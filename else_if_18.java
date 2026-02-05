package com.company;
import java.util.Scanner;

public class else_if_18 {
    public static void main(String[] args) {
        String var = "shireen";

        switch(var){
            case "uzma":
                System.out.println("You are going to become an Adult");
                break;
            case "shireen":
                System.out.println("You are going to join a Job");
                break;
            case "Adnan":
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        System.out.println("Thanks for using my Java Code!");


        /*
        int age;
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age>56){
            System.out.println("You are experienced");
        }
        else if (age>46) {
            System.out.println("You are semi-experienced");
        }
        else if (age>36) {
            System.out.println("You are semi-semi-experienced");
        }
        else {
            System.out.println("You are not experienced");
        }
        */

    }
}
