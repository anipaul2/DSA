package com.aniketh;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        int pivot  = findPivot(arr);
        return pivot + 1;

    }
    // Use this for non-duplicates
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        //Four cases over here
        //Find the middle element
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Ist case
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            // Case 3
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            // case 4

        }
        return -1;
    }
    // use this for duplicates
    //This method will work with duplicates
    // You can now solve sorted arrays if it has duplicate values also.
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        //Four cases over here
        //Find the middle element
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Ist case
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            // If elements at middle, start, end are equal then just skip the duplicates.
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // NOTE : What if the elements at start and end are pivots?
                // Check if start and end is pivot or not

                if(arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                // Check if end is pivot or not

                if (arr[end] < arr[end - 1]) {
                    return end-1;
                }
                end--;

            }
            // Left side is sorted so pivot should be in right.
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
