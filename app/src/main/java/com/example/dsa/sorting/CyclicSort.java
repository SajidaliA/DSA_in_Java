package com.example.dsa.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5};
        cyclicSort(arr);
        System.out.println("Sorted arr  is "+ Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {
        int i = 0;
        while (i<arr.length){
            if (arr[i] != arr[arr[i]-1]){
                swapInArr(arr, i, arr[i]-1);
            }else {
                i++;
            }
        }
    }
    private static void swapInArr(int[] arr, int lastIndex, int maxElement) {
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxElement];
        arr[maxElement] = temp;
    }
}
