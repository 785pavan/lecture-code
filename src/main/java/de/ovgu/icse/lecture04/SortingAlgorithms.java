package de.ovgu.icse.lecture02.sorting;

import java.util.Arrays;

public class SortingAlgorithms {
    
    /**
     * Implements a simple, non-optimized version of the 
     * <i>Insertion Sort</i> algorithm. 
     * @param arr -- array to be sorted
     */
    public static void insertionSort (int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int toInsert = arr[i], j;
            for (j = i; j>0 && toInsert < arr[j-1]; j--) {
                arr[j] = arr[j-1];
            }
            arr[j] = toInsert;
        }   
     } 
    
    /**
     *  Recursive implementation of Quicksort algorithm.
     *  It makes use of the helper method {@link SortingAlgorithms#partition(int[], int, int)}
     *  for dividing an array into two subarrays
     * @param arr
     * @param first
     * @param last
     */
    public static void qsort(int[] arr, int first, int last) {
        int split = partition(arr, first, last);  
        if (first < split - 1)
           qsort(arr, first, split - 1); //left subarray
        if (split < last)
           qsort(arr, split, last);      //right subarray
     }    
    
    /**
     * implements the "divide" part of Quicksort.
     * Hence, it is responsible to divide a given array in two 
     * subarrays, given a pivot element
     * @param arr -- array to be partitioned
     * @param first -- first index, starting point for going from left to right
     * @param last -- last index, starting point for going from right to left
     * @return
     */
    public static int partition(int[] arr, int first, int last) {
        int pivot = arr[last], temp = 0; //pivot
        int i = first - 1;           //index going left to right
        int j = last + 1;            //index going right to left
        while (i < j) {
            do {
                i++; 
            } while (arr[i] < pivot);

            do {
                j--; 
            } while (arr[j] > pivot);

            if (i < j) {
                temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;   //swap
            }
        }

        return i; //new index of pivot
     }    

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] unsortedArray = {1,2,3};//{3, 11, 6, 2, 5};
        //insertionSort(unsortedArray);
        qsort(unsortedArray, 0, unsortedArray.length-1);
        System.out.println("Sorted Array: " + Arrays.toString(unsortedArray));
    }

}
