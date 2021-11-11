package com.bl.algorithm;

import java.util.HashSet;
import java.util.Set;

public class PermutationString {
    static Set<String> set = new HashSet<>();

    public static void permutation(String array, int l, int r) {
        if (l == r) {
            if (set.contains(array))
                return;
            set.add(array);
            System.out.println("The " + array);
            return;
        }
        for (int i = l; i <= r; i++) {
            array = charInterchange(array, l, i);
            permutation(array, l + 1, r);
            array = charInterchange(array, l, i);
        }
    }

    static String charInterchange(String s, int a, int b) {
        char arry2[] = s.toCharArray();
        char temp = arry2[a];
        arry2[a] = arry2[b];
        arry2[b] = temp;
        return String.valueOf(arry2);
    }

    public static void main(String[] args) {
        permutation("abcde", 0, 3);

    }
}