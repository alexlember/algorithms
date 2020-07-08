package ru.lember.leetcode.dynamic;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Example 1:
 *
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 *
 *
 * Constraints:
 *
 * 1 <= n <= 45
 *
 *
 * Задача очень похожа на вычисление чисел Фибоначчи.
 * Можно снизить разход памяти до константы, затем с помощью умножения матриц можно добиться производительности O(logn).
 * Также можно использовать формулу Фибоначчи.
 */
public class ClimbingStairs {

    // bad.
//    public int climbStairs(int n) {
//
//        if (n == 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        } else if (n == 2) {
//            return 2;
//        } else if (n == 3) {
//            return 3;
//        }
//
//        return 1 + climbStairs(n - 1) + 1 + climbStairs(n - 2);
//    }

    public int climbStairsBrFr(int n) {

        return climbStairs(0, n);
    }

    private int climbStairs(int i, int n) {

        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        return climbStairs(i + 1, n) + climbStairs(i + 2, n);
    }

    public int climbStairsMemo(int n) {

        int memo[] = new int[n + 1];

        return climbStairs(0, n, memo);
    }

    private int climbStairs(int i, int n, int[] memo) {

        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (memo[i] > 0) {
            return memo[i];
        }

        memo[i] = climbStairs(i + 1, n, memo) + climbStairs(i + 2, n, memo);

        return memo[i];
    }

    /**
     * DP approach.
     */
    public int climbStairsDP(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /**
     * DP approach.
     */
    public int climbStairsFib(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
