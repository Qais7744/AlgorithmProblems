package com.bl.algorithm;

import java.util.Scanner;

public class MergeSort {
    private static final int ZERO = 0;

    public static void main(String[] args) {
        String[] stringArray = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        mergeSort(stringArray);
        for (String string : stringArray) {
            System.out.println(string);
        }
    }

    public static void mergeSort(String[] string) {
        if (string.length > 1) {
            String[] leftString = new String[string.length / 2];
            String[] rightString = new String[string.length - string.length / 2];
            for (int i = ZERO; i < leftString.length; i++) {
                leftString[i] = string[i];
            }
            for (int j = ZERO; j < rightString.length; j++) {
                rightString[j] = string[j + string.length / 2];
            }
            mergeSort(leftString);
            mergeSort(rightString);
            merge(string, leftString, rightString);
        }
    }

    public static void merge(String[] stringArray, String[] leftString, String[] rightString) {
        int a = ZERO;
        int b = ZERO;
        for (int i = ZERO; i < stringArray.length; i++) {
            if (b >= rightString.length || (a < leftString.length && leftString[a].compareToIgnoreCase(rightString[b]) < 0)) {
                stringArray[i] = leftString[a];
                a++;
            } else {
                stringArray[i] = rightString[b];
                b++;
            }
        }
    }
}