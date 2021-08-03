package com.company.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        Character result = findLength("aabccbbdggghl");
        System.out.println("Character: " + result);
    }

    public static Character findLength(String str) {
        /*
            Convert to list of string
            List<String> list = new ArrayList<>(str.split(""));
         */

        List<Character> list = new ArrayList<>();
        for (Character c : str.toCharArray()) {
            list.add(c);
        }

        Character result = '\0';
        for (Character c : list) {
            if (Collections.frequency(list, c) == 1) {
                result = c;
                break;
            }
        }

        return result;
    }
}