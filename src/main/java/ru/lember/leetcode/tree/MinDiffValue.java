package ru.lember.leetcode.tree;

public class MinDiffValue {


    // BST - easier solution in-order traverse = O(N)
    // BT - more general solution with traverse O(N) * & fining nearest using TreeSet floor and ceiling for O(lnN) = O(NlgN)

    int min = Integer.MAX_VALUE;
    Integer prev = null;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return min;

        getMinimumDifference(root.left);

        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;

        getMinimumDifference(root.right);

        return min;
    }

}
