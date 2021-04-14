package ru.lember.leetcode.tree;

/**
 * Given the root node of a binary search tree, return the sum of values of all nodes with a value in the range [low, high].
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
 * Output: 32
 * Example 2:
 *
 *
 * Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
 * Output: 23
 *
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [1, 2 * 104].
 * 1 <= Node.val <= 105
 * 1 <= low <= high <= 105
 * All Node.val are unique.
 */
public class RangeSumOfBst {


    public int rangeSumBST(TreeNode root, int low, int high) {
        return sum(root, low, high);
    }

    private int sum(TreeNode node, int low, int high) {

        if (node == null) {
            return 0;
        }

        int incr = 0;
        if (node.val >= low && node.val <= high) {
            incr = node.val;
        }

        // тут я изначально потерял, что речь шла именно о BST, не обязательно все дерево облазить.

        int leftBranchSum = 0;
        if (node.val >= low) {
            leftBranchSum = sum(node.left, low, high);
        }

        int rightBranchSum = 0;
        if (node.val <= high) {
            rightBranchSum = sum(node.right, low, high);
        }


        return incr + leftBranchSum + rightBranchSum;
    }

}
