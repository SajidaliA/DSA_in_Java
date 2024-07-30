package com.example.dsa.sorting;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        //Amazon leetcode hard question
        int[] arr = {3, 4, 2, 1};
        int missingPositive = cyclicSort(arr);
        System.out.println("Sorted arr  is " + Arrays.toString(arr));
        System.out.println("Duplicate element  is " + missingPositive);
    }

    private static int cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i]>0 && arr[i] != arr[correctIndex]) {
                swapInArr(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1){
                return j+1;
            }
        }
        return arr.length+1;
    }

    private static void swapInArr(int[] arr, int lastIndex, int maxElement) {
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxElement];
        arr[maxElement] = temp;
    }
}
