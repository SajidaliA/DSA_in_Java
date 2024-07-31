package com.example.dsa;

public class MaxFromMatrix {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 },
                { 25, 6, 7, 8 },
                { 9, 10, 11, 122 },
                { 13, 14, 15, 16 } };

        int max = findMaxFromMat(mat);
        System.out.println("MAx is " +max);
    }

    private static int findMaxFromMat(int[][] mat) {
        int max = 0;
        int N = 4;
        int M = 4;

        for (int i = 0; i<N;i++){
            for (int j=0; j<M; j++){
                if (mat[i][j]>max){
                    max = mat[i][j];
                }
            }
        }

        return max;
    }
}
