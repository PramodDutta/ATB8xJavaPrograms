package task;

import java.util.Scanner;

public class Task_20_Sept {
    public static void main(String[] args) {
        // FizzBuzz Problem
        // Write a program that prints numbers from 1 to n.(100)
        // However, for multiples of 3, print "Fizz" instead of the number,
        // and for multiples of 5, print "Buzz."
        // For numbers that are multiples of both 3 and 5,
        // print "FizzBuzz."

        // Logic Building

        // Step 1 -
        // Input -> int -n -> n = 100 - Scanner Class
        // Output -> String ->  Fizz, buzz and FizBuzz - SOP


        // Step 2  :
        // Rough Logic
        // for ->  int = 1 to i <=100 (n)
        //  i ->  multiple of 3 ->  modules -  i%3 == 0 -> Fizz
        //  i ->  multiple of 5 ->  modules -  i%5 == 0 -> Buzz
        //  i ->  multiple of 3,5 ->  modules -  i%5 && i%3 == 0 -> FizzBuzz
        // i


        // STEP 3: Real Logic

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n = 100");
        int n = sc.nextInt();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }


    }
}
