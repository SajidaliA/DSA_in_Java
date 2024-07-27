package com.example.dsa;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {15,14,13,16,7,11,10};
        int target = 2;
        int secondLargest =  bubbleSort(arr, target);
        System.out.println("Sorted array "+ Arrays.toString(arr));
        System.out.println("Second large is  "+ secondLargest);
    }

    static int bubbleSort(int[] arr, int target){
        boolean swapped;
        for (int i = 0; i < target; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                swapped = true;
            }
            if (!swapped){
                break;
            }
        }
        return arr[arr.length-target];
    }
}
