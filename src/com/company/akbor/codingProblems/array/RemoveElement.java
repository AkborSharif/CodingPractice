package com.company.akbor.codingProblems.array;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        //System.out.println(Arrays.toString(nums));
        return i;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{12, 2, 4,3, 4, 3}, 3));
    }
}
