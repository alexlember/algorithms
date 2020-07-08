package ru.lember.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p>
 * Note: A leaf is a node with no children.
 * <p>
 * Example:
 * <p>
 * Given binary tree [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * <p>
 * return its depth = 3.
 */
public class MaxDepthOfBinaryTree {


    public static void main(String... args) {

        TreeNode root = new TreeNode(3);
        TreeNode left1 = new TreeNode(9);
        TreeNode right1 = new TreeNode(20);
        root.left = left1;
        root.right = right1;


        TreeNode right21 = new TreeNode(7);
        TreeNode left22 = new TreeNode(15);
        right1.left = left22;
        right1.right = right21;

        MaxDepthOfBinaryTree service = new MaxDepthOfBinaryTree();
        System.out.println("expected length: 3, actual: " + service.maxDepthRecursive1(root));
    }


    int maxDepthRecursive1(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return traverse(root, 1);
    }

    private int traverse(TreeNode root, int currentDeep) {

        if (root.right == null && root.left == null) {
            return currentDeep;
        }

        int rightDeep = 0;

        if (root.right != null) {
            rightDeep = traverse(root.right, currentDeep);
        }

        int leftDeep = 0;

        if (root.left != null) {
            leftDeep = traverse(root.left, currentDeep);
        }

        return (leftDeep > rightDeep ? leftDeep : rightDeep) + currentDeep;
    }

    /**
     * short version (DFS.
     */
    int maxDepthRecursive2(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepthRecursive2(root.left), maxDepthRecursive2(root.right));
    }

    /**
     * Сначала в глубину.
     */
    int maxDepthIterativeDFS(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Stack<TreeNode> nodeStack = new Stack<>(); // нужен для DFS (LIFO)
        nodeStack.push(root);

        int max = 1;

        Stack<Integer> depthStack = new Stack<>();
        depthStack.push(max);

        while (!nodeStack.isEmpty()) {

            TreeNode node = nodeStack.pop();
            int temp = depthStack.pop();
            max = Math.max(temp, max);
            if (node.right != null) {
                nodeStack.push(node.right);
                depthStack.push(temp + 1);
            }
            if (node.left != null) { // пушим после right, т.к. в DFS нужно сначала доставать слева, потом уже справа
                nodeStack.push(node.left);
                depthStack.push(temp + 1);
            }
        }

        return max;
    }

    /**
     * Сначала в ширину
     */
    int maxDepthIterativeBFS(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>(); // // очередь нужна для BFS (FIFO)

        queue.offer(root);

        int count = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();
            while (size-- > 0) {

                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }

            }

            count++; // увеличиваем после прохождения одного уровня.


        }

        return count;
    }
}