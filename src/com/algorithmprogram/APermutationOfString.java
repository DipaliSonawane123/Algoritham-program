/*
 *  Permutation of the string means all the possible new strings that can be formed by
 *  interchanging the position of the characters of the string.
 *
 *  For example :-
 *     string ABC has permutations [ABC, ACB, BAC, BCA, CAB, CBA].
 */
package com.algorithmprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class APermutationOfString {

    // using Collections
    public static void findPermutations(String str) {

        if (str == null || str.length() == 0) {
            return;
        }

        List<String> partial = new ArrayList<>();
        partial.add(String.valueOf(str.charAt(0))); // initialize the list with the first character of th
        for (int i = 1; i < str.length(); i++) {
            for (int j = partial.size() - 1; j >= 0; j--) {
                // remove current partial permutation from the ArrayList
                String s = partial.remove(j);
                for (int k = 0; k <= s.length(); k++) {
                    // Advice: use StringBuilder for concatenation
                    partial.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
                }
            }
        }
        System.out.println(partial);
    }

    public static void main(String[] args) {
        System.out.println("Enter a string : ");
        Scanner str1 = new Scanner(System.in);
        String str = str1.next();
        findPermutations(str);
    }
}



