package com.company.akbor.interviewProblems;

import java.util.Arrays;

public class revenueMilestone {
    private static int search(int[] rev, int val) {
        int left = 0, right = rev.length-1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (val == rev[mid]) {
                return mid+1;
            }else if (val > rev[mid]) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return left+1;
    }

    public static int[] getMilestoneDays(int[] revenues, int[] milestones) {
        int[] res = new int[milestones.length];
        for (int i = 1; i < revenues.length; i++)
            revenues[i] += revenues[i-1];
        for (int i = 0; i < milestones.length; i++) {
            res[i] = search(revenues, milestones[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] revenues = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] milestones = {100, 200, 500};

        int [] ans = getMilestoneDays(revenues,milestones);

        System.out.println(Arrays.toString(ans));
    }
}
