package ru.lember.leetcode.tree;

import java.util.*;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its level order traversal as:
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */
public class BTLevelOrderTraversal {


    public static void main(String... args) {

    }


    List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        bfsTraversal(root, result);
        return result;
    }


    private void bfsTraversal(TreeNode root, List<List<Integer>> result) {

        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            List<Integer> level = new ArrayList<>();
            for (TreeNode node : queue) {
                level.add(node.val);
            }
            result.add(level);

            int size = queue.size();

            while (size-- > 0) {

                TreeNode current = queue.poll();

                if (current == null) {
                    continue;
                }

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }

        }
    }

}


