package com.example.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,6,7,2,4,3,0,1};
        insertionSort(arr);
        System.out.println("Sorted arr "+ Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if (arr[j]<arr[j-1]) {
                    swapInArr(arr, j, j - 1);
                }else {
                    break;
                }
            }
        }
    }

    private static void swapInArr(int[] arr, int lastIndex, int maxElement) {
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxElement];
        arr[maxElement] = temp;
    }
}
