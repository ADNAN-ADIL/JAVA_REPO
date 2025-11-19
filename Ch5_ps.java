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
//        int sum=0;
//        int n=4;
//        for (int i=0;i<n;i++){
//            sum = sum + (2*i);
//        }
//        System.out.print("Sum of "+n+" even numbers is: ");
//        System.out.println(sum);
        //problem 2 using while loop
//        int sum = 0, n = 7,count=0;
//        while (count<=n){
//            sum = sum+(2*count);
//            count++;
//        }
//        System.out.println("Sum of first "+n+" even numbers is:"+sum);
        //First 7 even numbers - 0 2 4 6 8 10 12 14
        //First 4 even numbers - 0 2 4 6

        //problem 3
//        int n=5;
//        for(int i=1;i<=10;i++){
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }
        //problem 4
//        int n=10;
//        for (int i=10;i>=1;i--){
//            System.out.printf("%d X %d = %d\n",n,i,n*i);
//        }
        //Problem 5
//        int n = 7;
//        int factorial = 1;
//        for (int i=1;i<=n;i++){
//            factorial *= i;
//        }
//        System.out.println("Factorial of "+n+" is "+factorial);
        //Problem 6 is using while loop for above question
//        int n=5;
//        int i = 1;
//        int factorial = 1;
//        while (i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);
        //Problem 7
//        int rows=4;
//        while (rows>=1) {
//            int j=1;
//            while (j <= rows) {
//                System.out.print(" * ");
//                j++;
//            }
//            System.out.println();
//            rows--;
//        }
        //Problem 8 -- True
        //What can be done using one type of loop
        // can be done using other two types of loops
        //Problem 9
//        int n=8;
//        int sum = 0;
//        for(int i=1;i<=10;i++){
//            sum += n*i;
//        }
//        System.out.println(sum);
        //Problem 10
        //A do while loop is executed
        //      at least once
//        Problem 11
        int sum =0;
        int n = 8;
        int count = 0;
        while (count<n){
            sum += (2*count);
            count++;
        }
        System.out.println(sum);
    }
}
