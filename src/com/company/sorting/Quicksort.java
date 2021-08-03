package com.company.sorting;// Quick sort in Java

import java.util.Arrays;

class Quicksort {

    // method to find the partition position
    static int partition(int[] array, int low, int high) {

        // choose the rightmost element as pivot
        int pivot = array[high];

        // pointer for greater element
        int ptr = (low - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {

                // if element smaller than pivot is found
                // swap it with the greater element pointed by ptr
                ptr++;

                // swapping element at ptr with element at j
                int temp = array[ptr];
                array[ptr] = array[j];
                array[j] = temp;
            }

        }

        // swap the pivot element with the greater element specified by ptr
        int temp = array[ptr + 1];
        array[ptr + 1] = array[high];
        array[high] = temp;

        System.out.println(Arrays.toString(array));
        // return the position from where partition is done
        return (ptr + 1);
    }

    static void quickSort(int array[], int low, int high) {
        if (low < high) {

            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition(array, low, high);

            // recursive call on the left of pivot
            quickSort(array, low, pi - 1);

            // recursive call on the right of pivot
            quickSort(array, pi + 1, high);
        }
    }


    public static void main(String[] args) {

        int[] data = {8, 7, 2, 1, 0, 9, 6};

        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(data));

        int size = data.length;

        // call quicksort() on array data
        quickSort(data, 0, size - 1);

        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
/*
After 1st loop
[2, 1, 0, 6, 8, 9, 7]

left: 2 1 0         right: 8 9 7
 */

/*
Quicksort Complexity
Best	O(n*log n)
It occurs when the pivot element is always the middle element or near to the middle element.

Worst	O(n^2):
It occurs when the pivot element picked is either the greatest or the smallest element.
This condition leads to the case in which the pivot element lies in an extreme end of the sorted array.
One sub-array is always empty and another sub-array contains n - 1 elements. Thus, quicksort is called only on this sub-array.

Average	O(n*log n)
Space Complexity	O(log n)

 */