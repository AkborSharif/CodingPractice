package com.company.akbor.codingProblems.search;

import java.util.Arrays;

public class binarySearch {
    public static int Search(Integer[] nums, int target, int first, int last) {
        while (first + 1 < last) {
            int mid = first + (last - first) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                last = mid;
            } else {
                first = mid;
            }
        }
        //post processing
//        if (Math.abs(target - nums[last]) <= Math.abs(target - nums[first])) {
//            return last;
//        } else {
//            return first;
//        }
        if (target == nums[first]) return first;
        else if (target == nums[last]) return last;
        else return -1;
    }

    public static void main(String[] args) {
        //Array must be sorted
        Integer[] nums = {1, 2, 8, 4, 3, 5, 5, 6, 7, 9};
        Arrays.sort(nums);
        for (Integer num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        int first = 0;
        int last = nums.length-1;
        int index = Search(nums, 5, first, last);
        System.out.println(index);
    }
}
