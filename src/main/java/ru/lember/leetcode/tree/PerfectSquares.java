package ru.lember.leetcode.tree;

import java.util.*;

/**
 * Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 12
 * Output: 3
 * Explanation: 12 = 4 + 4 + 4.
 * Example 2:
 * <p>
 * Input: n = 13
 * Output: 2
 * Explanation: 13 = 4 + 9.
 */
public class PerfectSquares {


    public static void main(String... args) {

    }

    int numSquares(int n) {

        // BFS.
        // Java BFS implementation: Start from node 0 in queue,
        // and keep pushing in perfect square number + curr value,
        // once we reach number n, we found the solution.
        if (n == 0) {
            return 0;
        }

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(0);
        visited.add(0);

        int depth = 0;
        while (!queue.isEmpty()) {

            int size = queue.size();
            depth++;

            while (size-- > 0) {

                Integer current = queue.poll();

                Objects.requireNonNull(current);

                for (int i = 1; i * i <= n; i++) {
                    int v = current + i * i;
                    if (v == n) {
                        return depth;
                    }
                    if (v > n) {
                        break;
                    }
                    if (!visited.contains(v)) {
                        queue.offer(v);
                        visited.add(v);
                    }
                }

            }


        }

        return n;
    }

    int numSquaresDP(int n) {

        // DP.

        // 12
        // 1, 4, 9, //16..
        // 1 + minSquare(12 - 1)
        // 4 + minSquare(12 - 4)
        // = 4 + minSquare(8) = 4 + 1 + minSquare(8 - 1) = 4 + 4 + minSquare(8 - 4)

        //

        if (n == 0) {
            return 0;
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, n);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }


}


