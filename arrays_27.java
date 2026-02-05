package com.company;

public class arrays_27 {
    public static void main(String[] args) {
        /* float [] marks = {98.5f,45.5f,79.5f,99.5f,80.5f};
        String []students = {"Adnan","Uzma","Adil","harry"};
        System.out.println(students.length);
        System.out.println(students[1]);
        */

        int [] marks = {98,45,79,99,80};
//        System.out.println(marks.length);
//        System.out.println(marks[2]);
        //Displaying the Array(for loop)
//        System.out.println("Printing using for loop");
//        for(int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }
        //Displaying the Array in Reverse order(for loop)
//        System.out.println("Printing using for loop in reverse order");
//        for(int i= marks.length-1;i>=0;i--){
//            System.out.println(marks[i]);
//        }
        //Displaying the Array(for-each loop)
        System.out.println("Printing using for-each loop");
        for (int mark:marks){
            System.out.println(mark);
        }
    }
}
