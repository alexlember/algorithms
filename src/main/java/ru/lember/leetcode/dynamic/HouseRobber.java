package ru.lember.leetcode.dynamic;

/**
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing each of them is that adjacent
 * houses have security system connected and it will automatically contact the police
 * if two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of money of each house,
 * determine the maximum amount of money you can rob tonight without alerting the police.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 *              Total amount you can rob = 1 + 3 = 4.
 * Example 2:
 *
 * Input: nums = [2,7,9,3,1]
 * Output: 12
 * Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
 *              Total amount you can rob = 2 + 9 + 1 = 12.
 *
 *
 * Constraints:
 *
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 400
 */
public class HouseRobber {

//    public int rob(int[] nums) { проеб
//
//        int fromFirstSum = 0;
//        int fromSecondSum = 0;
//
//        for (int fromFirst = 0, fromSecond = 1;
//             fromFirst < nums.length || fromSecond < nums.length;
//             fromFirst += 2, fromSecond += 2) {
//
//            if (fromFirst < nums.length) {
//                fromFirstSum += nums[fromFirst];
//            }
//
//            if (fromSecond < nums.length) {
//                fromSecondSum += nums[fromSecond];
//            }
//        }
//
//        return Math.max(fromFirstSum, fromSecondSum);
//
//    }


    /*
    2. broot force ~ O(n^n)
     */



//    public int rob(int[] nums) {
//
//        return robRecursive(nums, 0);
//
//    }
//
//    private int robRecursive(int[] nums, int i) {
//
//        if (nums.length == 0) {
//            return 0;
//        }
//
//        if (nums.length == 1) {
//            return nums[0];
//        }
//
//        if (nums.length == 2) {
//            return Math.max(nums[0], nums[1]);
//        }
//
//        if (nums.length == 3) {
//            return Math.max(nums[0] + nums[2], nums[1]);
//        }
//
//        if (i < nums.length - 1) {
//            return Math.max(nums[i], robRecursive(Arrays.copyOfRange(nums, i, nums.length - 1), ++i));
//        }
//
//        return nums[i];
//
//    }


//    public int rob(int[] nums) {
//
//        if (nums.length == 0) {
//            return 0;
//        }
//
//        if (nums.length == 1) {
//            return nums[0];
//        }
//
//        if (nums.length == 2) {
//            return Math.max(nums[0], nums[1]);
//        }
//
//        if (nums.length == 3) {
//            return Math.max(nums[0] + nums[2], nums[1]);
//        }
//
//        // find max house.
//        int maxIndex = 0;
//        int max = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] > max) {
//                max = nums[i];
//                maxIndex = i;
//            }
//        }
//    }


    public int rob(int[] nums) {

        int robPrevious = 0; // сколько max можем набрать, обворовывая предыдущий
        int notRobPrevious = 0;  // сколько max можем набрать, не обворовывая предыдущий

        for (int house : nums) {

            int current = notRobPrevious + house; // если обворовываем текущий, значит не можем обворовывать предыдущий.
            int currentNot = Math.max(robPrevious, notRobPrevious); // если не обворовываем текущий, значит максимум для нас - лучшее из кейсом, с обворовыванием или без обворовывания предыдущего.

            robPrevious = current;
            notRobPrevious = currentNot;

        }

        return Math.max(robPrevious, notRobPrevious);
    }


}
