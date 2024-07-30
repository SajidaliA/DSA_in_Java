package com.example.dsa;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,4,4,5,5};
        int target = 7;
        int start = 0;
        int end = arr.length -1;

        int left = findLeft(arr, target,start,end);
        int right = findRight(arr, target,start,end);

        int[] newArr = {left, right};

        System.out.println("First and Last is: "+ Arrays.toString(newArr));
    }

    private static int findRight(int[] arr, int target, int start, int end) {
        int right = -1;
        while (start<=end){
            int mid = (start+end)/2;
            if (target == arr[mid]){
                right = mid;
                start = mid +1;
            }else if (target>arr[mid]){
                start = mid +1;
            }else {
                end = mid - 1;
            }
        }

        return right;
    }

    private static int findLeft(int[] arr, int target, int start, int end) {
        int left = -1;

        while (start<=end){
            int mid = (start+end)/2;
            if (target == arr[mid]){
                left = mid;
                end = mid-1;
            }else if (target>arr[mid]){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return left;
    }
}
