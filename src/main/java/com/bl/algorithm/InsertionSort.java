package com.bl.algorithm;

import java.util.Scanner;

public class InsertionSort {
    private static int ZERO = 0;

    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= ZERO && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = ZERO; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many Numbers of Elements Do you Want to Insert? : ");
        int elements = scanner.nextInt();
        System.out.println("Total Size = " + elements);
        String str[] = new String[elements]; // Total number of words/elements to be taken as input in the string array
        System.out.println("Entre Numbers To Sort: ");
        int arr[] = new int[elements];
        /**
         * Loop is to take all the elements in the String array
         */
        for (int i = ZERO; i < elements; i++) {
            str[i] = scanner.next();
            arr[i] = Integer.parseInt(str[i]);

        }

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        printArray(arr);
    }
}