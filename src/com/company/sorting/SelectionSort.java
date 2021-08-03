package com.company.sorting;

import java.util.Arrays;

public class SelectionSort {

    static int[] getSortedList(int[] a) {

        for (int step = 0; step < a.length - 1; step++) {
            int min = step;

            for (int i = step + 1; i < a.length; i++) {
                if (a[i] < a[min])
                    min = i;
            }

            int temp = a[step];
            a[step] = a[min];
            a[min] = temp;
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
Selection Sort Complexity
Time Complexity
Best	O(n2)
Worst	O(n2)
Average	O(n2)
Space Complexity	O(1)
 */