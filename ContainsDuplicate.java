package com.caltinsoy.interviewquest;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicateByUsingBitMan(int[] nums) {
        // 1,1,3,5 = true
        // 1,9,3,5 = false
        byte[] mark = new byte[150000];
        for (int i : nums) {
            int j = i / 8;
            int k = i % 8;
            int check = 1 << k;
            if ((mark[j] & check) != 0) {
                return true;
            }
            mark[j] |= check;
        }
        return false;
    }

    public static boolean containsDuplicateByUsingSet(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        for (int num : nums) {
            if (!integerSet.add(num)) {
                return true;
            }
        }
        return false;
    }

}
