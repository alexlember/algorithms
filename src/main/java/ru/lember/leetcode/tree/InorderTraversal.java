package ru.lember.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 *
 * Example:
 *
 * Input: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * Output: [1,3,2]
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 *
 *
 * Pre-order : NLR
 * In-order : LNR
 * Reverse in-order RNL
 * Post-order : LRN
 */
public class InorderTraversal {


    public static void main(String... args) {

    }

    /**
     * Time complexity : O(n).
     *
     * Space complexity : O(n).
     */
    List<Integer> inorderTraversalIterative(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Stack<TreeNode> nodeStack = new Stack<>();

        TreeNode current = root;
        while (current != null || !nodeStack.isEmpty()) {

            while (current != null) {
                nodeStack.push(current);
                current = current.left;
            }


            current = nodeStack.pop();
            result.add(current.val);
            current = current.right;
        }


        return result;
    }


    /**
     * Time complexity : O(n). The time complexity is O(n) because the recursive function is T(n)=2⋅T(n/2)+1.
     *
     * Space complexity : The worst case space required is O(n), and in the average case it's (logn) where n is number of nodes.

     */
    List<Integer> inorderTraversalRecursive(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        recursiveHelper(root, result);

        return result;
    }

    private void recursiveHelper(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            recursiveHelper(root.left, result);
        }

        result.add(root.val);

        if (root.right != null) {
            recursiveHelper(root.right, result);
        }

    }
}


