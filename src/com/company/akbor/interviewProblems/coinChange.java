package com.company.akbor.interviewProblems;

import java.util.Arrays;

public class coinChange {
    public static int coinChange(int[] coins, int amount) {
        int minLength = 0;
        int dp [] = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
   /*
    * i represent the amount starting from 0 to 11
    * dp[i] stores the min length of the coins up to the amount i
    */
        for (int i = 0; i <= amount; i++) {
            for (int coin: coins) {
                if (coin>i) continue;
                else {
                    dp[i] = Math.min(dp[i], dp[i-coin]+1);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[amount]!=amount+1? dp[amount]:-1;
    }

    public static boolean coinChangeRecursion(int[] coins, int amount){
        if(amount< 0) return false;
        if (amount==0) return true;
        System.out.println(Arrays.toString(coins) + " Remaining: "+ amount);
        for(int i = 0; i<coins.length; i++){
            if(coinChangeRecursion(coins, amount-coins[i])){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1,2,3}, 11));
        System.out.println(coinChangeRecursion(new int[]{2}, 8));
    }
}
