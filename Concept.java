package com.aniketh;

public class Concept {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        fun(--n);
        // If you are asked digit problem, simply take remainder of it and divide the number by 10.
        // (n--) will make it a infinite recursion call.
        // This is an infinite recursion and it is known as stack overflow.
        // n-- vs --n is not the same. Here, the recursion call is not correct.
    }
}
