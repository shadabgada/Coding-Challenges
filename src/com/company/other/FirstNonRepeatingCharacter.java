package com.company.other;

import java.util.*;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        Character result = findLength("aabccbbdggghl");
        System.out.println("Character: " + result);

        System.out.println(findLengthByHashMap("efficient"));
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


    public static Character findLengthByHashMap(String str) {

        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        Character result = '\0';
        for (Character c : str.toCharArray()) {
            if(map.get(c)==1){
                return c;
            }
        }

        return result;
    }
}