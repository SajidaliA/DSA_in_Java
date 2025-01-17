package com.example.dsa;

public class Floor {

    public static void main(String[] args) {
        int[] arr = {2,4,8,10,12,14,16,18,20};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    //Greatest number <= target
    private static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }else {
                //ans found
                return mid;
            }
        }
        return end;
    }
}