package com.example.dsa;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int n = arr.length;
        countEvenOdd(arr, n);
    }

    private static void countEvenOdd(int[] arr, int n) {
        int evenCount = 0;
        int oddCount = 0;


        for (int i=0; i< n;i++){
            if ((arr[i] & 1)==1){
                oddCount++;
            }else{
                evenCount++;
            }
        }

        System.out.println("Number of even: "+evenCount);
        System.out.println("Number of odd: "+oddCount);
    }

}
