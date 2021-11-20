package com.aniketh;
// Very important lines of code to understand recursion in searching.
import java.lang.reflect.Array;
import java.util.ArrayList;

// This code is clear example of using linear search in recursion in boolean and int ways.
public class Find {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5, 6, 8};
        // Below both the procedure to print the solution will work.
//        System.out.println(findAllIndex2(arr, 3, 0, new ArrayList<>()));
        ArrayList<Integer> ans = findAllIndex3(arr,3,0);
        System.out.println(ans);
    }
    static boolean LinearRecursion(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || LinearRecursion(arr, target, index+1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }
    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    // Code to understand how to add a target element in a list using recursion.
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex2(arr, target, index+1, list);
    }
// Don't use this approach because this is not that optimised and it's making new list everytime.
    static ArrayList<Integer> findAllIndex3(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex3(arr, target, index+1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
