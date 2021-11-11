package com.bl.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {

    public static void main(String[] args) {
        String nameOne, nameTwo;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter string One");
        nameOne=scanner.next();
        System.out.println("Enter string Two");
        nameTwo=scanner.next();
        AnagramDetection anagramDetection = new AnagramDetection();
        boolean isAnagram = anagramDetection.isAnagram(nameOne,nameTwo);
        if(isAnagram) {
            System.out.println("Two String are anagram");
        }else {
            System.out.println("Two String are not anagram");
        }
    }

    public boolean isAnagram(String nameOne, String nameTwo) {
        char[] arr1 = nameOne.toCharArray();
        char[] arr2 = nameTwo.toCharArray();
        if (nameOne.length() != nameTwo.length()) {
            return false;
        } else {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
        }
        return false;
    }
}