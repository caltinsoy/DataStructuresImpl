package com.caltinsoy.interviewquest;

public class NumberOfBits {


    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
        System.out.println(hammingWeight_shortCut(00000000000000000000000000001011));
    }


    public static int hammingWeight(int n) {
        int counter = 0;
        while (n != 0) {
            n = n & (n - 1);
            counter++;
        }

        return counter;
    }

    public static int hammingWeight_shortCut(int n) {
        return Integer.bitCount(n);
    }
}
