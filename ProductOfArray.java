package com.caltinsoy.interviewquest;

import java.util.Arrays;

public class ProductOfArray {

    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        System.out.println(Arrays.toString(productOfArr(arr)));
        System.out.println(Arrays.toString(productOfArrSecondSol(arr)));
    }

    /*
     * Time Complexity : O(n)
     * Space Complexity: O(1)
     * */
    private static long[] productOfArrSecondSol(int[] a) {
        long multiplyOfValues = 1;
        long counter = 0; // calculate number of 0 in arr.
        int lengthOfArr = a.length;

        for (int j : a) {
            if (j == 0)
                counter++;
            else
                multiplyOfValues *= j;
        }

        long[] productOfArr = new long[lengthOfArr];
        for (int i = 0; i < lengthOfArr; i++) {
            if (counter > 1) {
                productOfArr[i] = 0;
            } else if (counter == 0) {
                productOfArr[i] = (multiplyOfValues / a[i]);
            } else if (counter == 1 && a[i] != 0) {
                productOfArr[i] = 0;
            } else {
                productOfArr[i] = multiplyOfValues;
            }
        }
        return productOfArr;
    }


    private static int[] productOfArr(int[] arr) {
        /*Time Complexity = O(n)
          Space Complexity = O(n).
        * */

        int len = arr.length;
        //iterate all of elements
        int[] left = new int[len];
        int[] right = new int[len];
        int[] out = new int[len];

        left[0] = 1;

        right[len - 1] = 1;


        /* Construct the left array */
        for (int i = 1; i < len; i++)
            left[i] = arr[i - 1] * left[i - 1];

        /* Construct the right array */
        for (int j = len - 2; j >= 0; j--)
            right[j] = arr[j + 1] * right[j + 1];

        /* Construct the product array using
        left[] and right[] */
        for (int i = 0; i < len; i++)
            out[i] = left[i] * right[i];

        return out;
    }

}
