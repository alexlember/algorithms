package ru.lember.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 *
 *
 *
 * Example 1:
 *
 * Input: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *    2
 * Output: 1
 * Example 2:
 *
 * Input: root = [5,3,6,2,4,null,null,1], k = 3
 *        5
 *       / \
 *      3   6
 *     / \
 *    2   4
 *   /
 *  1
 * Output: 3
 * Follow up:
 * What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?
 *
 *
 *
 * Constraints:
 *
 * The number of elements of the BST is between 1 to 10^4.
 * You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
 */
public class KthSmallestElembentInBST {


    public static void main(String... args) {

    }


    /**
     * Time complexity : O(N) to build a traversal.
     * Space complexity : O(N) to keep an inorder traversal.
     */
    int kthSmallest(TreeNode root, int k) {

        List<Integer> result = new ArrayList<>();

        recursiveHelper(root, result);

        return result.stream().skip(k - 1).findFirst().orElse(-1);
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


    /**
     * Time complexity : O(H+k), where H is a tree height.
     * This complexity is defined by the stack, which contains at least H+k elements,
     * since before starting to pop out one has to go down to a leaf.
     * This results in O(logN+k) for the balanced tree
     * and O(N+k) for completely unbalanced tree with all the nodes in the left subtree.
     * Space complexity : O(H+k), the same as for time complexity, O(N+k) in the worst case,
     * and O(logN+k) in the average case.
     */
    int kthSmallestIterative(TreeNode root, int k) {

        Stack<TreeNode> stack = new Stack<>();

        while (true) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (--k == 0) {
                return root.val;
            }
            root = root.right;
        }
    }


}


