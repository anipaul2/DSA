package com.aniketh;

public class NumbersExamples {
    public static void main(String[] args) {
        // Print first 5 numbers: 1,2,3,4,5
        // Write a function that takes a number and prints it
        print1(1);
    }
    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }
    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }
    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }
    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }
    // Here function body changes
    static void print5(int n) {
        System.out.println(n);
    }
}
