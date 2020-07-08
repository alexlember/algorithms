package ru.lember.leetcode.tree;

/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Example:
 *
 * Given the sorted array: [-10,-3,0,5,9],
 *
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 *       9
 *      / \
 *    5   0
 *    /   /
 *  -3  -10
 */
public class SortedArrayToBST {


    public static void main(String... args) {

    }

    TreeNode sortedArrayToBST(int[] nums) {


        if (nums == null || nums.length == 0) {
            return null;
        }


        return formTree(nums, 0, nums.length - 1);

    }

    private TreeNode formTree(int[] nums, int start, int finish) {

        if (start > finish) {
            return null;
        }

        int median = start + (finish - start) / 2;

        TreeNode currentRoot = new TreeNode(nums[median]);

        currentRoot.left = formTree(nums, start, median - 1);
        currentRoot.right = formTree(nums,median + 1, finish);

        return currentRoot;

    }

}


