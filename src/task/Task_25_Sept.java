package task;

import java.util.Scanner;

public class Task_25_Sept {
    //  Table of number n = 10, print table with For or while.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number\n");
        int n = sc.nextInt();
        System.out.println("Mul of Table");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n + "x" + i + " = " + (n*i));
        }

//        int n = 10; // The number for which we want the multiplication table
//        int i = 1; // Starting point
//
//        System.out.println("Multiplication Table of " + n + " using While Loop:");
//        while (i <= 10) {
//            System.out.println(n + " x " + i + " = " + (n * i));
//            i++; // Increment i
//        }

    }
}
