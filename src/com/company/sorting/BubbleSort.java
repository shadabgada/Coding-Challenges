package com.company.sorting;

import java.util.Arrays;

public class BubbleSort {

    static int[] getSortedList(int[] a) {

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length - 1; j++) {

                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }

        }


        return a;
    }


    public static void main(String[] args) {
        int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(getSortedList(a)));
    }
}

/*
Bubble Sort Complexity
Time Complexity
Best	O(n) : If the array is already sorted, then there is no need for sorting.
Worst	O(n^2) : If we want to sort in ascending order and the array is in descending order then the worst case occurs.
Average	O(n^2) : It occurs when the elements of the array are in jumbled order (neither ascending nor descending).
Space Complexity	O(1) : Space complexity is O(1) because an extra variable is used for swapping

In the optimized bubble sort algorithm, two extra variables are used. Hence, the space complexity will be O(2)


 */