package com.example.dsa.binarysearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] ascArr = {1,2,3,4,5,6,7};
        int[] desArr = {9,8,7,6,5,4,3};
        int target = 3;
        int start = 0;
        int targetIndex = OABinarySearch(ascArr, target, start, ascArr.length-1);
        System.out.println("Target index is: "+targetIndex);
    }

    static int OABinarySearch(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start]<arr[end];
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (target > arr[mid] && isAsc){
                start = mid + 1;
            }else if (target > arr[mid] && !isAsc){
                end = mid - 1;
            }else if (target < arr[mid] && isAsc){
                end = mid - 1;
            } else if (target<arr[mid] && !isAsc) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
