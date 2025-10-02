package com.company;

public class Ch5_ps {
    public static void main(String[] args) {
        //practice Problem 1
//        int n = 4;
//        for (int i=n;i>0;i--){
//            for (int j=0;j<i;j++) {
//                System.out.print("*");
//            }
//        System.out.print("\n");
//        }
        //problem 2
        int sum=0;
        int n=4;
        for (int i=0;i<n;i++){
            sum = sum + (2*i);
        }
        System.out.print("Sum of even numbers is: ");
        System.out.println(sum);
        //First 4 even numbers - 0 2 4 6
    }
}
