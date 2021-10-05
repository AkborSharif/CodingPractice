package com.company.akbor.codingProblems.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSumUsingLoop(int[] nums, int target) {
        //using two for loops
        if (nums.length > 1) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[0];
    }

    public static int[] twoSumUsingHashMap(int[] nums, int target) {
        //using HashMap
        if (nums.length > 1) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (!map.containsKey(complement)) {
                    map.put(nums[i], i);
                } else {
                    return new int[]{map.get(complement), i};
                }
            }
        }
        return new int[0];
    }


    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;

        int twoSum[] = twoSumUsingLoop(nums, target);
        System.out.println(Arrays.toString(twoSum));

        twoSum = twoSumUsingHashMap(nums, target);
        System.out.println(Arrays.toString(twoSum));
    }
}
