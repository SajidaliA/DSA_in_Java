package com.example.dsa.sorting;

import java.util.Arrays;

public class MissingNo {
    public static void main(String[] args) {
        int[] arr = {4,2,1,0};
        int missingElement = cyclicSort(arr);
        System.out.println("Sorted arr  is "+ Arrays.toString(arr));
        System.out.println("Missing element  is "+ missingElement);
    }
    private static int cyclicSort(int[] arr) {
        int i = 0;
        while (i<arr.length){
            int correctIndex = arr[i];
            if (arr[i] != arr.length && arr[i] != arr[correctIndex]){
                swapInArr(arr, i, correctIndex);
            }else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
    private static void swapInArr(int[] arr, int lastIndex, int maxElement) {
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxElement];
        arr[maxElement] = temp;
    }
}
