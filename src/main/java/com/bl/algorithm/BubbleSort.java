package com.bl.algorithm;

import java.util.Scanner;

public class BubbleSort {
    private static final int ZERO = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Total Number of Array Elements You Want To sort: ");
        int elements = scanner.nextInt();
        int arr[] = new int[elements];
        System.out.println("Enter " + elements + " Array Elements: ");
        for (int i = ZERO; i < elements; i++)
            arr[i] = scanner.nextInt();

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr, elements);
    }

    private void sort(int[] arr, int arrLength) {
        System.out.println("Before Sorting");
        //prints the array before sorting
        for (int i = ZERO; i < arrLength; i++)
            System.out.print(arr[i] + " ");

        System.out.println("\nAfter Sorting\n");
        for (int i = ZERO; i < arrLength - 1; i++) {
            for (int j = ZERO; j < arrLength - i - 1; j++) {
                int temp;
                //swap arr[j+1] and arr[i]
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
        //prints the array
        for (int i = ZERO; i < arrLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}