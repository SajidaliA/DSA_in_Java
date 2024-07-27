package com.example.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {};
        selectionSort(arr);
        System.out.println("Sorted arr "+ Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length-i-1;
            int maxElement = getMax(arr, lastIndex);
            swapInArr(arr, lastIndex, maxElement);
        }
    }

    private static void swapInArr(int[] arr, int lastIndex, int maxElement) {
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxElement];
        arr[maxElement] = temp;
    }

    private static int getMax(int[] arr, int end) {
        int max = 0;
        for (int i = 0; i <= end; i++) {
            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
