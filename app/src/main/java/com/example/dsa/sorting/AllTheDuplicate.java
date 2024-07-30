package com.example.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllTheDuplicate {
    public static void main(String[] args) {
        //Amazon question
        int[] arr = {4, 5,7, 3, 2, 7, 8, 2, 1,4};
        List<Integer> duplicateElement = cyclicSort(arr);
        System.out.println("Sorted arr  is " + Arrays.toString(arr));
        System.out.println("Duplicate element  is " + duplicateElement);
    }

    private static List<Integer> cyclicSort(int[] arr) {
        int i = 0;
        List<Integer> duplicate = new ArrayList<>();
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swapInArr(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                duplicate.add(arr[j]);
            }
        }
        return duplicate;
    }

    private static void swapInArr(int[] arr, int lastIndex, int maxElement) {
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxElement];
        arr[maxElement] = temp;
    }
}
