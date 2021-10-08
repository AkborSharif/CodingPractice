package com.company.akbor.codingProblems.array;

public class MaxSumSubArray {
    public static int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum >= maxSum) {
                maxSum = currSum;
            }
            if (currSum <= 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }
}
