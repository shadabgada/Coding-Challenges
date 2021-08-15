package com.company.other;

import java.util.Arrays;

/*
Write a function to check whether two given strings are anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, “abcd” and “dabc” are an anagram of each other.
 */
public class Anagram {

    static boolean checkAnagram(String s1, String s2) {

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        if (arr1.length != arr2.length)
            return false;

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=arr2[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("String are anagrams: " + checkAnagram("abcd", "dabc"));
        System.out.println("String are anagrams: " + checkAnagram("aabcd", "dabbc"));

    }
}
