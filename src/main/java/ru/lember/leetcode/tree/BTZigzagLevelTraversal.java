package ru.lember.leetcode.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its zigzag level order traversal as:
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 */
public class BTZigzagLevelTraversal {


    public static void main(String... args) {

    }

    List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        bfsTraverse(root, result);
        return result;
    }


    private void bfsTraverse(TreeNode root, List<List<Integer>> resultList) {

        LinkedList<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);

        boolean isReversed = false;

        while (!nodeQueue.isEmpty()) {

            int size = nodeQueue.size();

            List<Integer> level = new ArrayList<>();
            if (!isReversed) {
                for (TreeNode n : nodeQueue) {
                    level.add(n.val);
                }
            } else {
                Iterator<TreeNode> i = nodeQueue.descendingIterator();
                while (i.hasNext()) {
                    level.add(i.next().val);
                }
            }
            resultList.add(level);

            isReversed = !isReversed;


            while (size-- > 0) {

                TreeNode currentNode = nodeQueue.poll();

                if (currentNode != null) {

                    if (currentNode.left != null) {
                        nodeQueue.offer(currentNode.left);
                    }

                    if (currentNode.right != null) {
                        nodeQueue.offer(currentNode.right);
                    }

                }

            }

        }

    }

}


