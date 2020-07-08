package ru.lember.leetcode.tree;

import lombok.EqualsAndHashCode;
import lombok.ToString;

//Definition for a binary tree node.
@EqualsAndHashCode
@ToString
class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

//    @Override
//    public boolean equals(Object obj) {
//
//
//        if (!(obj instanceof TreeNode)) {
//            return false;
//        }
//
//        TreeNode that = (TreeNode) obj;
//
//        return treesAreEqual(this, that);
//    }

    private static boolean treesAreEqual(TreeNode first, TreeNode second) {

        if (first == null && second == null) {
            return true;
        }

        if (first == null || second == null) {
            return false;
        }

        if (first.val != second.val) {
            return false;
        }

        if (first.right == null
                && second.right == null
                && first.left == null
                && second.left == null) {
            return true;
        }

        if (first.left != null && second.left == null) {
            return false;
        }

        if (first.left == null && second.left != null) {
            return false;
        }

        if (first.right != null && second.right == null) {
            return false;
        }

        if (first.right == null && second.right != null) {
            return false;
        }

        return treesAreEqual(first.left, second.left)
                && treesAreEqual(first.right, second.right);

    }
}
