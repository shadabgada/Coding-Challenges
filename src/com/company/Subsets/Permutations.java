package com.company.Subsets;

import java.util.*;

class Permutations {

    public static List<List<Integer>> findPermutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> permutations = new LinkedList<>();
        permutations.add(new ArrayList<>());
        for (int currentNumber : nums) {
            // we will take all existing permutations and add the current number to create new permutations
            int n = permutations.size();
            System.out.println(permutations);
            //At, this stage we have each level permutations (See diagram to understand level)
            /* Sample output at this level
                [[]]
                [[1]]
                [[3, 1], [1, 3]]
            */
            for (int i = 0; i < n; i++) {

                List<Integer> oldPermutation = permutations.poll();
                // create a new permutation by adding the current number at every position
                for (int j = 0; j <= oldPermutation.size(); j++) {
                    List<Integer> newPermutation = new ArrayList<Integer>(oldPermutation);
                    newPermutation.add(j, currentNumber);
                    if (newPermutation.size() == nums.length)
                        result.add(newPermutation);
                    else
                        permutations.add(newPermutation);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = Permutations.findPermutations(new int[]{1, 3, 5});
        System.out.print("Here are all the permutations: " + result);
    }
}
/*
    Time complexity #
        We know that there are a total of N! permutations of a set with ‘N’ numbers.
        In the algorithm above, we are iterating through all of these permutations with the help of the two ‘for’ loops.
        In each iteration, we go through all the current permutations to insert a new number in them.
        To insert a number into a permutation of size ‘N’ will take O(N),
        which makes the overall time complexity of our algorithm O(N*N!)

 */