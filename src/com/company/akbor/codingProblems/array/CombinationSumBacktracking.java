package com.company.akbor.codingProblems.array;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumBacktracking {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(candidates, 0, target, new ArrayList<Integer>(), result);
        return result;
    }
    public static void backTrack(int[]cand, int start, int target, List<Integer> list, List<List<Integer>> result){
        if (target<0) return;
        if (target == 0) {
            result.add(new ArrayList(list));
            return;
        }
        for (int i = start; i < cand.length; i++) {
            list.add(cand[i]);
            backTrack(cand, i, target-cand[i], list, result);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        int [] candidates = {2,3,6,7};
        List<List<Integer>> result = combinationSum(candidates, 7);
        System.out.println(result);
    }
}
