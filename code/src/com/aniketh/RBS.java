package com.aniketh;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));

    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        //If you don't find a pivot that means the array is not rotated
        if (pivot == -1) {
            // Just do binary search
            return binarySearch(nums, target, 0, nums.length-1);

        }

        // If pivot is found, you've found two ascending sorted arrays.
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);

        }
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }
    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
    // This will not work for duplicate values

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
