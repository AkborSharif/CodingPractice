package com.company.akbor.codingProblems.array;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start + 1 < end) {
            mid = (start + end) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid;
            } else end = mid;
        }
        if (target <= nums[start]) return start;
        if (target == nums[end] || nums[start] < target && target < nums[end]) return end;
        else return end + 1;

    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 9));
    }
}
