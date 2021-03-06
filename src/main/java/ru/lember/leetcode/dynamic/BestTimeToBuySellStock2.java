package ru.lember.leetcode.dynamic;

/**
 * Say you have an array prices for which the ith element is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 *
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 *
 * Example 1:
 *
 * Input: [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 *              Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 * Example 2:
 *
 * Input: [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 *              Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
 *              engaging multiple transactions at the same time. You must sell before buying again.
 * Example 3:
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 *
 *
 * Constraints:
 *
 * 1 <= prices.length <= 3 * 10 ^ 4
 * 0 <= prices[i] <= 10 ^ 4
 */
public class BestTimeToBuySellStock2 {

//    public int maxProfitBF(int[] prices) {
//
//        int dp[] = new int[prices.length];
//
//        int max = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                int profit = prices[j] - prices[i];
//                if (dp[i] < profit) {
//                    dp[i] = profit;
//                }
//                if (profit > max) {
//                    max = profit;
//                }
//            }
//        }
//        return max;
//    }

    /**
     * Покупаем тогда, когда:
     * 1) Мы еще не покупали
     * 2) Следующая цена будет больше, чем текущая.
     *
     * Продаем тогда, когда:
     * 1) Уже купили
     * 2) Следующая цена меньше, чем текущая.
     */
    public int maxProfit(int prices[]) {

        int bought = 0;
        int sold = 0;

        boolean hasBought = false;

        int currentPrice = 0;
        int nextPrice = 0;

        for (int i = 0; i < prices.length - 1; i++) {

            currentPrice = prices[i];
            nextPrice = prices[i + 1];

            if (!hasBought) {

                if (currentPrice < nextPrice) {
                    bought += currentPrice;
                    hasBought = true;
                }

            } else {

                if (currentPrice > nextPrice) {
                    sold += currentPrice;
                    hasBought = false;
                }


            }
        }

        if (hasBought) {
            sold += nextPrice;
        }

        return sold - bought;
    }

}
