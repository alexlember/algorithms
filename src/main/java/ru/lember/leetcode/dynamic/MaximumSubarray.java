package ru.lember.leetcode.dynamic;

/**
 * + #DivideAndConquer
 * <p>
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * Example:
 * <p>
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 * <p>
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more su
 */
public class MaximumSubarray {

    // шляпное решение
//    public int maxSubArray(int[] nums) {
//
////        if (nums.length == 1) {
////            return nums[0];
////        }
//
//
//        int maxSum = nums[0];
//        int currentSum = maxSum;
//
//        for (int i = 1; i < nums.length; i++) {
//
//            int current = nums[i];
////            int next = nums[i + 1];
////
//            currentSum += current;
//
//            if (currentSum > maxSum) {
//                maxSum = currentSum;
//            } else {
//                currentSum = 0;
//            }
//
//        }
//
//        return maxSum;
//    }

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n]; //dp[i] means the maximum subarray ending with nums[i];

        dp[0] = nums[0];
        int max = dp[0];

        for (int i = 1; i < n; i++) {
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }

        return max;
    }

    public int maxSubArray2(int[] a) {
        int maxSoFar = a[0];
        int maxEndingHere = a[0];
        for (int i = 1; i < a.length; ++i) {
            maxEndingHere = Math.max(maxEndingHere + a[i], a[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

}
