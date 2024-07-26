package com.example.dsa;

public class Armstrong {
    public static void main(String[] args) {

        /*  if the given num and the sum of power of all digit.
            for ex given num is 456
            then length of given num is 3, so we have to find the 3 power of every single digit
            like (4 * 4 * 4) + (5 * 5 * 5) + (6 * 6 * 6) = 405
            so 405 is not equal to 456. so given num is not Armstrong;
         */

        int num = 153;
        int tempNum = num;
        int length = lengthOfGivenInt(num);
        int sumOfPower = 0;
        int singleDigit;
        while (tempNum != 0){
            singleDigit = tempNum % 10;
            tempNum = tempNum/10;
            sumOfPower = (int) (sumOfPower + Math.pow(singleDigit, length));
        }
        System.out.println(num == sumOfPower);
    }

    private static int lengthOfGivenInt(int num) {
        int lenght = 0;
        while (num != 0){
            lenght++;
            num = num/10;
        }
        return lenght;
    }
}
