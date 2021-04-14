package ru.lember.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 *
 * Assume a BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 *
 *
 * Example 1:
 *
 *     2
 *    / \
 *   1   3
 *
 * Input: [2,1,3]
 * Output: true
 * Example 2:
 *
 *     5
 *    / \
 *   1   4
 *      / \
 *     3   6
 *
 * Input: [5,1,4,null,null,3,6]
 * Output: false
 * Explanation: The root node's value is 5 but its right child's value is 4.
 */
public class ValidateBST {

    boolean isValidBST(TreeNode root) {

        List<Integer> values = new ArrayList<>();

        dfs(root, values);

        if (values.isEmpty() || values.size() == 1) {
            return true;
        }

        int prev = values.get(0);

        for (int i = 1; i < values.size(); i++) {
            int curr = values.get(i);
            if (curr < prev) {
                return false;
            }
            prev = curr;
        }
        return true;
    }


    private void dfs(TreeNode node, List<Integer> values) {

        if (node == null) {
            return;
        }

        dfs(node.left, values);
        values.add(node.val);
        dfs(node.right, values);
    }


    public boolean isValidBstRecursive(TreeNode root) {
        return isValidBstRecursiveUtil(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    boolean isValidBstRecursiveUtil(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return isValidBstRecursiveUtil(root.left, min, root.val)
                && isValidBstRecursiveUtil(root.right, root.val, max);
    }
}


