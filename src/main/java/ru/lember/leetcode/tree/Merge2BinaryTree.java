package ru.lember.leetcode.tree;

/**
 *
 * !Easy!
 *
 * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.
 *
 * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
 *
 * Example 1:
 *
 * Input:
 * 	Tree 1                     Tree 2
 *           1                         2
 *          / \                       / \
 *         3   2                     1   3
 *        /                           \   \
 *       5                             4   7
 * Output:
 * Merged tree:
 * 	     3
 * 	    / \
 * 	   4   5
 * 	  / \   \
 * 	 5   4   7
 */
public class Merge2BinaryTree {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return recursiveHelper(t1, t2);
    }

    private TreeNode recursiveHelper(TreeNode t1, TreeNode t2) {

        if (t1 == null && t2 == null) {
            return null;
        }

        TreeNode merged = new TreeNode();
        merged.val = mergeValues(t1, t2);

        TreeNode l1 = null;
        TreeNode l2 = null;
        TreeNode r1 = null;
        TreeNode r2 = null;

        if (t1 != null) {
            l1 = t1.left;
            r1 = t1.right;
        }

        if (t2 != null) {
            l2 = t2.left;
            r2 = t2.right;
        }

        merged.left = recursiveHelper(l1, l2);
        merged.right = recursiveHelper(r1, r2);
        return merged;
    }

    private Integer mergeValues(TreeNode t1, TreeNode t2) {

        if (t1 != null && t2 != null) {
            return t1.val + t2.val;
        } else if (t1 != null) {
            return t1.val;
        } else if (t2 != null) {
            return t2.val;
        } else {
            return null;
        }
    }

}
