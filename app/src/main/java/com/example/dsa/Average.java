package com.example.dsa;

public class Average {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 4, 5, 6, 7, 8, 9};
        int size = arr.length;

        average(arr, size);
    }

    private static void average(int[] arr, int size) {
        int average;
        int sum = 0;
        for(int i=0; i<size;i++){
            sum = sum + arr[i];
        }
        average = sum/size;
        System.out.println("Average: "+average);
    }
}
