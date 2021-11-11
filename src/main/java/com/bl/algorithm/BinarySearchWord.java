package com.bl.algorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinarySearchWord {
    public static void main(String[] args) throws Exception {

        List<String> fileArray = new ArrayList<>();
        ;
        // Need to read file line by line
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Altamash\\IdeaProjects\\AlgorithmPrograms\\wordlist.txt"));
        String saveLine;
        while ((saveLine = bufferedReader.readLine()) != null) {
            fileArray.add(saveLine);
        }
        bufferedReader.close();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Key: ");
        String inputString = scanner.nextLine();
        // Check if your word exists or not.
        BinarySearchWord binarySerchFile = new BinarySearchWord();
        Arrays.sort(fileArray.toArray());
        System.out.println(fileArray);
        int index = binarySerchFile.binarySearchString(fileArray, inputString);
        if (index == -1) {
            System.out.println(" word Not found in file:" + inputString);
        } else {
            System.out.println(" word found in file:" + inputString);
        }
    }

    public int binarySearchString(List<String> array, String key) {
        int start = 0;
        int end = array.size();
        while (start < end) {
            int mid = (start + end) / 2;
            //System.out.println(mid);
            if (key.compareTo((String) array.toArray()[mid]) < 0) {
                end = mid;
            } else if (key.compareTo((String) array.toArray()[mid]) > 0) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}