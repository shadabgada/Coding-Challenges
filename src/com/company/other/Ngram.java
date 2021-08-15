package com.company.other;

import java.util.ArrayList;
import java.util.List;

/*
A n-gram is a sequence of n characters within a given piece of text.
input: "abcdef"

3-grams: abc   bcd  cde  def
4-grams: abcd  bcde  cdef


 */
public class Ngram {

    static List<String> getNGrams(String s, int k) {

        List<String> ngrams = new ArrayList<>();

        for (int i = 0; i <=s.length() - k; i++) {
            ngrams.add(s.substring(i, i + k));
        }

        return ngrams;
    }

    public static void main(String[] args) {
        List<String> ngrams = new ArrayList<>();

        ngrams = getNGrams("abcdef", 3);
        for (String s : ngrams) {
            System.out.println(s);
        }

        ngrams.clear();

        ngrams = getNGrams("abcdef", 4);
        for (String s : ngrams) {
            System.out.println(s);
        }

    }
}
