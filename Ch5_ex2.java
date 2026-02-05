package com.company;

import java.util.Scanner;
import java.util.Random;

public class Ch5_ex2 {

// 0 for rock
// 1 for paper
// 2 for scissors


    public static void main(String[] args)
    {

        for (int i=1;i<=5;i++){


            System.out.println("Enter 0 for rock ,1 for paper,2 for scissors ");
            Scanner obj = new Scanner(System.in);
            int userinput = obj.nextInt();

            Random obj1 = new Random();
            int botinput = obj1.nextInt(3);

            if (userinput==botinput){
                System.out.println("Match is drawn");
            }
            else if (userinput==0 && botinput==2 || userinput==1 && botinput==0 || userinput==2 && botinput==1){
                System.out.println("User win");
            }
            else {
                System.out.println("Computer win");
            }

            switch (botinput){

                case 0:
                    System.out.println("Computer choice is: 1");
                    break;

                case 1:
                    System.out.println("Computer choice is: 2");
                    break;

                case 2:
                    System.out.println("Computer choice is: 3");
            }
        }
    }
}