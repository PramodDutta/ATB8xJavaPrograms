package oct.ex_02102024;

import sept.Person;

import java.util.Scanner;

public class Lab124 {
    public static void main(String[] args) {
        // Object Class - OOps
        // String Class - Ref
        // Arrays
            // for each
            // 2d nested for loop

       // Class -> Blueprint to create something
        // Objects - Instance of the class - created from the class.

        ATBStudent amit = new ATBStudent();
        amit.age  =35;

        ATBStudent abhishek = new ATBStudent();
        abhishek.age = 65;

        System.out.println(amit); // oct.ex_02102024.ATBStudent@a09ee92

        System.out.println(abhishek); // oct.ex_02102024.ATBStudent@30f39991

        // abhishek - Ref VARAIBLE - bYTE, ir bits ->  8, 64, null default
    }
}
