package com.example.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Asked in google
public class AllTheMissingElements {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> missingElement = cyclicSort(arr);
        System.out.println("Sorted arr  is " + Arrays.toString(arr));
        System.out.println("Missing element  is " + missingElement);
    }

    private static List<Integer> cyclicSort(int[] arr) {
        int i = 0;
        List<Integer> missing = new ArrayList<>();
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swapInArr(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
               missing.add(j+1);
            }
        }
        return missing;
    }

    private static void swapInArr(int[] arr, int lastIndex, int maxElement) {
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxElement];
        arr[maxElement] = temp;
    }
}
