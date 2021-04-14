package ru.lember.dpforinterview.optimalcost;

/**
 * There are N stations ina a route 0->n-1 in only forward.
 * The cost between any 2 stations is given. Find min cost of travel from 0 to n-1.
 */
public class OptimalCostDP {

    /**
     * O(e^n) - complexity
     */
    int calcMinCost(int s, int d, int[][] cost) {
        int n = cost.length;

        int[] minCost = new int[n];

        minCost[0] = 0;
        minCost[1] = cost[0][1];

        for (int i = 2; i < n; i++) {
            minCost[i] = cost[0][i];

            for (int j = 1; j < i; j++) {
                if (minCost[i] > minCost[j] + cost[i][j]) {
                    minCost[i] = minCost[j] + cost[i][j];
                }
            }
        }

        return minCost[n - 1];
    }

}
