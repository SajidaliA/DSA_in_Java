package com.example.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,6,7,1,0};
        bubbleSort(arr);
        System.out.println("Sorted array "+ Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j]<arr[j-1]){
                 swapInArr(arr, arr[j], arr[j-1]);
                }
                swapped = true;
            }
            if (!swapped){
                break;
            }
        }

    }
    private static void swapInArr(int[] arr, int lastIndex, int maxElement) {
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxElement];
        arr[maxElement] = temp;
    }
}
