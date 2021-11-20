package com.aniketh;
// This code also contains palindromic number proof using recursion.

public class Reverse {
    public static void main(String[] args) {
        System.out.println(palindrome(1));
    }
    static int sum = 0;
    static void rev1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        rev1(n/10);
    }
    static int rev2(int n) {
        // Sometimes you might need some additional variables in the arguments.
        // In that case, make another function.
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }
    static int helper(int n, int digits) {
        if (n%10 == 0) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
    static boolean palindrome(int n) {
        return n == rev2(n);
    }

}
