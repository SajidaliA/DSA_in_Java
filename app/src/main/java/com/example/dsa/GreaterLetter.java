package com.example.dsa;

public class GreaterLetter {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d'};
        char target = 'b';
        char ans = findGreaterLetter(target, arr);
        System.out.println(ans);

    }
    static char findGreaterLetter(char target, char[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target > arr[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
    }
}
