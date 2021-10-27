package com.aniketh;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        // This is a matrix question in 2D arrays
        // This is an unsorted matrix where the value is different in row and column wise.
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(arr, 37)));

    }
    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {
            if(matrix[r][c] == target) {
                return  new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }

        }
        return new int[]{-1, -1};

    }
}
