package com.company.akbor.codingProblems.array;

import java.util.Arrays;

public class RemoveDuplicate {
/*    public static int findLastOccurrence(int nums[], int low, int target) {
        int high = nums.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == nums[mid]) {
                result = mid;
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        int i = 0;
        int j = 0;

        while (i < nums.length) {
            int index = findLastOccurrence(nums, i + 1, nums[i]);
            if (index != -1) {
                nums[j++] = nums[index];
                i = index + 1;
            } else {
                nums[j++] = nums[i];
                i++;
            }
            count++;
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }*/

/*    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(Arrays.toString(nums));
        return i + 1;
    }*/

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        System.out.println(Arrays.toString(nums));
        return i + 1;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}
