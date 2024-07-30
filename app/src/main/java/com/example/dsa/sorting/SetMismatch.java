package com.example.dsa.sorting;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        //Amazon question
        int[] arr = {4, 5, 6, 3, 2, 8, 2, 1};
        int[] setMismatch = cyclicSort(arr);
        System.out.println("Sorted arr  is " + Arrays.toString(arr));
        System.out.println("Duplicate element  is " + Arrays.toString(setMismatch));
    }

    private static int[] cyclicSort(int[] arr) {
        int i = 0;
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
                return new int[]{arr[j], j+1};
            }
        }
        return new int[]{-1,-1};
    }

    private static void swapInArr(int[] arr, int lastIndex, int maxElement) {
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxElement];
        arr[maxElement] = temp;
    }
}
