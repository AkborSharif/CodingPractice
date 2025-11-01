package com.company.akbor.codingProblems.number;

public class
PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if (n < 1) return false;
        while (n % 3 == 0) {
            n = n / 3;
            //System.out.println(n);
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(45));
        System.out.println(isPowerOfThree(1));
        System.out.println(isPowerOfThree(0));
    }
}
