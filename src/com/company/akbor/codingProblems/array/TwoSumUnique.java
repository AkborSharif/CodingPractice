package com.company.akbor.codingProblems.array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoSumUnique {
    public static int twoSumUniquePairs(List<Integer> nums, int target) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> complement = new HashSet<>();
        int ans = 0;
        for (Integer num : nums) {
            if (complement.contains(target - num) && !seen.contains(num)) {
                // (num, target - num) is a pair that sums to the target
                ans++;
                // mark num and target - num as seen so that when we see (target - num, num) it won't be counted again
                seen.add(num);
                seen.add(target - num);
            }
            complement.add(num);
        }
        return ans;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        int target = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int res = twoSumUniquePairs(nums, target);
        System.out.println(res);
    }
}
