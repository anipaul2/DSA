package com.aniketh;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Write a pattern code where it prints "*" when n = 4 using recursion
//pattern2(4, 0);
        int[] arr = {1, 5, 3, 6, 8, 4, 7};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void pattern2(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            pattern2(row, col + 1);
            System.out.print("*" + " ");

        } else {
            pattern2(row - 1, 0);
            System.out.println();
        }
    }

    static void pattern(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("*" + " ");
            pattern(row, col + 1);

        } else {
            System.out.println();
            pattern(row - 1, 0);
        }
    }

    static void selection(int[] arr, int row, int col, int max) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[max]) {
                selection(arr, row, col + 1, col);
            } else {
                selection(arr, row, col + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            selection(arr, row - 1, 0, 0);
        }
    }



    static void bubble(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                // swap
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;

            }
            bubble(arr, row, col + 1);
        } else {
        bubble(arr, row - 1, 0);
    }
}

}
