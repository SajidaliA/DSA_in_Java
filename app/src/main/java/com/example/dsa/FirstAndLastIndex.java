package com.example.dsa;

import java.util.Arrays;
//leetCode facebook interview question
public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] arr = {4,5,5,5,7,7,7,8,8,9};
        int target = 7;
        int[] ans = {-1,-1};
        ans[0] = searchRange(target, arr, true);
        if (ans[0] != -1){
            ans[1] = searchRange(target, arr, false);
        }
        System.out.println(Arrays.toString(ans));

    }
    static int searchRange(int target, int[] arr, boolean isFirstIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start= mid+1;
            }else if (target < arr[mid]){
                end = mid-1;
            } else {
                ans =mid;
                if (isFirstIndex) {
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
