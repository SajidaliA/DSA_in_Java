package com.example.dsa.sorting;

import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        //Amazon, Microsoft
        int[] arr = {1,3,4,2,2};
        int missingElement = cyclicSort(arr);
        System.out.println("Sorted arr  is " + Arrays.toString(arr));
        System.out.println("Duplicate element  is " + missingElement);
    }
    private static int cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i+1) {
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    swapInArr(arr, i, correctIndex);
                } else {
                    return arr[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }

    private static void swapInArr(int[] arr, int lastIndex, int maxElement) {
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxElement];
        arr[maxElement] = temp;
    }
}
