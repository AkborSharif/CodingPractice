package com.company.akbor.codingProblems.array;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
                j++;
            } else {
                j++;
            }

        }
        //System.out.println(Arrays.toString(nums));
        return i;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{12, 2, 3, 4, 3}, 3));
    }
}
