package com.example.dsa;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,8,12,45,78,95};
        int target = 100;
        int ans = binarySearch(target, arr);
        System.out.println("Target index : "+ans);
    }

    static int binarySearch(int target, int[] arr){
        int start = 0;
        int end = arr.length -1;


        while (start <= end){
            int mid = (start + (end - start)/2);
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
