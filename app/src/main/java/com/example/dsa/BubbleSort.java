package com.example.dsa;

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

    }
}
