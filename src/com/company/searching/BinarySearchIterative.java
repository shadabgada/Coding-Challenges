package com.company.searching;

class BinarySearchIterative {
    static int binarySearch(int[] array, int x, int low, int high) {

        // Repeat until the pointers low and high meet each other
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == x)
                return mid;

            if (array[mid] < x)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 3, 4, 5, 6, 7, 8, 9 };
        int n = array.length;
        int x = 4;
        int result = binarySearch(array, x, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}

/*
Time Complexities

Best case complexity: O(1)
Average case complexity: O(log n)
Worst case complexity: O(log n)
Space Complexity

The space complexity of the binary search is O(1)
 */