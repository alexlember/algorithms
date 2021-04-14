package ru.lember.dpforinterview.optimalcost;

/**
 * There are N stations ina a route 0->n-1 in only forward.
 * The cost between any 2 stations is given. Find min cost of travel from 0 to n-1.
 */
public class OptimalCostMemo {

    private int[][] cost;
    private int[][] memo;

    /**
     * O(e^n) - complexity
     */
    int calcMinCost(int s, int d, int[][] cost) {
        this.cost = cost; // sparse array - is better case here.
        this.memo = new int[cost.length][cost[0].length];

        return calcMinCost(s, d);
    }

    private int calcMinCost(int s, int d) {

        if (s == d || s == d-1) {
            return cost[s][d];
        }

        if (memo[s][d] == 0) {

            int minCost = cost[s][d];

            for (int i = s + 1; i < d; i++) {
                int temp = calcMinCost(s, i) + calcMinCost(i, d);
                if (temp < minCost) {
                    minCost = temp;
                }
            }

            memo[s][d] = minCost;

        }
        return memo[s][d];
    }

}
