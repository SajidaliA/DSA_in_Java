package com.example.dsa;

public class IsSortedArray {
    public static void main(String[] args) {
        int[] arr = {20, 23, 23, 45, 78, 88};

        if (isSortedArray(arr, arr.length)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }

    private static boolean isSortedArray(int[] arr, int length) {
        if (length == 1 || length == 0) return true;
        return (arr[length-1] >= arr[length-2] && isSortedArray(arr, length-1));
    }
}
