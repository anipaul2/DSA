package com.aniketh;

public class NumbersExamplesRecursion {
    public static void main(String[] args) {
        // Print first 5 numbers: 1,2,3,4,5
        // Write a function that takes a number and prints it
        print(1);
    }
    static void print(int n) {
        if (n == 5) {
            System.out.println(5);
            return;

        }
        System.out.println(n);
        // recursive call
        // if you are calling a function again and again, you can treat it as a separate call in a stack.
        // This is called tail recursion
        // This is the last function call
        print(n + 1);
    }
}
