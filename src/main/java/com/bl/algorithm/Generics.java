package com.bl.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Generics {

    private static <K extends Comparable<K>> void addedSort(K[] array) {
        for (int i = 1; i < array.length; i++) {
            K key = array[i];
            int j = i - 1;
            while (j >= 0 && (array[j].compareTo(key) > 0)) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static <T extends Comparable<T>> int binarySearch(T[] array, int low, int high, T key) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (array[mid].equals(key))
                return mid;
            if (array[mid].compareTo(key) > 0) {
                return binarySearch(array, low, mid - 1, key);
            } else {
                return binarySearch(array, mid + 1, high, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How Many Elements do you Want to Insert:\n");
        int length = scanner.nextInt();
        String[] array = new String[length];
        System.out.println("Enter Array Elements:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }

        System.out.println("1. Binary Search using Generics.\n2. Insertion Sort Using Generics."
                + "\n3. Bubble Sort Using Generics.\nEnter Your Choice: ");

        switch (scanner.nextInt()) {
            case 1:

                System.out.println("Sorted Array is: ");
                Arrays.sort(array);

                for (String str : array)
                    System.out.print(str + " ");

                System.out.println("\nEnter Value to search: ");
                String key = scanner.next();
                int value = binarySearch(array, 0, array.length - 1, key);
                if (value == -1) {
                    System.out.println("Element Not Present");
                } else
                    System.out.println("Element Found at Index " + value);

            case 2:
                addedSort(array);
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
        }
    }
}