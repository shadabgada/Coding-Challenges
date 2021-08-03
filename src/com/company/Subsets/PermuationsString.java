package com.company.Subsets;

import java.util.*;

class PermutationsString {

    //Find if one string contains any of the permutation of another string

    public static List<String> findPermutations(String s1) {
        List<String> result = new ArrayList<>();
        Queue<String> permutations = new LinkedList<>();
        permutations.add("");
        for (int index = 0; index < s1.length(); index++) {
            // we will take all existing permutations and add the current number to create new permutations
            int n = permutations.size();
            System.out.println(permutations);
            //At, this stage we have each level permutations (See diagram to understand level)
            /* Sample output at this level
            []
            [a]
            [ba, ab]
            */
            for (int i = 0; i < n; i++) {

                String oldPermutation = permutations.poll();
                // create a new permutation by adding the current number at every position
                for (int j = 0; j <= oldPermutation.length(); j++) {
                    StringBuilder newPermutation = new StringBuilder(oldPermutation);
                    newPermutation.insert(j, s1.substring(index, index + 1));
                    if (newPermutation.length() == s1.length())
                        result.add(newPermutation.toString());
                    else
                        permutations.add(newPermutation.toString());
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> result = PermutationsString.findPermutations("abc");
        System.out.println("Here are all the permutations: " + result);

        System.out.println("String check:"+getCheck(result, "acb"));
    }

    public static Boolean getCheck(List<String> result, String s2) {
        return result.contains(s2);
    }
}
