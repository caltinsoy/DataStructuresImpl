package com.caltinsoy.interviewquest;

public class IsUgly {

    public static void main(String[] args) {
        System.out.println(isUgly(75));
    }

    public static boolean isUgly(int num) {
        if(num == 1) return true;
        for (int i=2; i<6 && num>0; i++) {
            while (num % i == 0)
                num /= i;
        }
        return num == 1;
    }
}
