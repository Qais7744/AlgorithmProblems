package com.bl.algorithm;

import java.util.Scanner;

public class FindYourNumber {

    public static void main(String[] args) {
        FindYourNumber findNumber = new FindYourNumber();
        int number = Integer.parseInt("10");
        int range = (int) Math.pow(2, number);
        System.out.println("Range is 0 to " + range);
        findNumber.yourNumber(range);

    }

    public void yourNumber(int range) {
        Scanner scanner = new Scanner(System.in);
        int low = 0;
        int high = range - 1;
        int medium = (low + high) / 2;

        System.out.println();
        System.out.println("Think of a number in your mind between 0 to " + (range - 1));

        while (low < high) {
            System.out.println("If your number is between " + low + " to " + medium + " Press 1 ");
            System.out.println("If your number is between " + (medium + 1) + " to " + high + " Press 2");

            int value = scanner.nextInt();
            if (value == 1) {

                high = medium;
                medium = (low + high) / 2;

            } else if (value == 2) {
                low = medium + 1;
                medium = (low + high) / 2;
            } else {
                System.out.println("Wrong input ");
            }
        }

        System.out.println("Your number is :" + medium);
        scanner.close();
    }
}