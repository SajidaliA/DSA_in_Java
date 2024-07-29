package com.example.dsa;

public class EvenDigitNumbers {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = {12,345,24,-65,7896};
        for (int j : arr) {
            if (j<0){
                j = j *-1;
            }
            if (((int)Math.log10(j)+1) % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
