package com.company;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (max < A[i]) {
                max = A[i];
            }
        }

        boolean[] visited = new boolean[max + 1];
        Arrays.fill(visited, false);

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (visited[A[i]] == true) {
                sum = sum - A[i];
                visited[A[i]] = false;
            } else {
                visited[A[i]] = true;
                sum = sum + A[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("abcd");
        System.out.println(solution(new int[]{9, 3, 9, 3, 9, 7, 9}));

    }

}

