package com.company.other;// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//https://www.c-sharpcorner.com/blogs/minimum-deletions-to-get-a-unique-count-of-characters
//https://app.codility.com/programmers/task/different_characters/

class Min_Deletions_to_Make_Character_Frequencies_Unique {

    public static void main(String[] args) {
        System.out.println(solution("aaaabbbbccccdddd"));
        System.out.println(solution("ceabaacb"));
        System.out.println(solution("aaabbbcc   "));

    }
    public static int solution(String input) {
        // write your code in Java SE 8
        int numOfDeletion = 0;
        List<Integer> charCount = new ArrayList<>();

        Set<Character> charSet = new HashSet<>();
        for(Character character: input.toCharArray()){
            charSet.add(character);
        }

        for(Character character : charSet)
        {
            int countChr = getCount(input, character);
            while (countChr != 0 && charCount.contains(countChr))
            {
                countChr--;
                numOfDeletion++;
            }
            charCount.add(countChr);
//            System.out.println(character + " " + countChr);
        }
        return numOfDeletion;
    }

    public static int getCount(String input, char search) {
        int count=0;
        for(int i=0; i<input.length(); i++)
        {
            if(input.charAt(i) == search)
                count++;
        }
        return count;
    }
}
