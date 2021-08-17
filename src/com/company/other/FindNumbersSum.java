package com.company.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindNumbersSum {

    //findNumbers([1,2,5,7],7)
    static void findNumbersOptimized(List<Integer> list, int n) {

        Collections.sort(list);

        int sum = 0;
        int startIndex = 0;
        int endIndex = list.size() - 1;

        while (startIndex < endIndex) {

            sum = list.get(startIndex) + list.get(endIndex);
            if (sum == n) {
                System.out.println(list.get(startIndex) + "," + list.get(endIndex));
                break;
            } else if (sum < n) {
                startIndex++;
            } else {
                endIndex--;
            }
        }

    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(5);
        list.add(7);
        findNumbersOptimized(list, 7);

        list.clear();

        list.add(1);
        list.add(4);
        list.add(6);
        list.add(9);
        findNumbersOptimized(list, 13);

        list.clear();

        list.add(1);
        list.add(4);
        list.add(4);
        list.add(5);
        findNumbersOptimized(list, 6);
    }
}
