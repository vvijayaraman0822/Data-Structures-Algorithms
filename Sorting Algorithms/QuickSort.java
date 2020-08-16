package com.quicksort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 7, 1, 3, 5, 8, 9, 6, 754, 0};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int begin, int end) {

       /*
        1. Get a Pivot from the Array.
        2. Find the Partition that separates left from the right
        3. Call QuickSort for the left half of the Array.
        4. Call Quick Sort for the right half og the Array.
        */

        // Average Run Time O(N log N) -> Log N for recursion * N for the partition = NLogN
        if (begin < end) { // after one iteration, all numbers to left of pivot is lesser than pivot and right is greater than pivot
            int partitionIndex = partition(arr, begin, end); // find the partition
            quickSort(arr, begin, partitionIndex - 1); // left sub-list of array
            quickSort(arr, partitionIndex + 1, end); // right sub-list of array

        }
    }

    /* We reorder all the elements around the pivot – the ones with smaller value are placed before it, and all the elements greater than the pivot after it.
       After this step, the pivot is in its final position. This is the important partition step. After this step, we know the left half and the right half of
       the array. */
    public static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = begin - 1;

        // identify what slot pivot should go into
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }
        // put the pivot value in the correct slot
        int swap = arr[end];
        arr[end] = arr[i + 1];
        arr[i + 1] = swap;

        return i + 1;
    }
}
