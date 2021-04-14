package ru.lember.leetcode.tree;

/**
 * easy
 *
 * Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 *
 * Example:
 * Given a binary tree
 *           1
 *          / \
 *         2   3
 *        / \
 *       4   5
 * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
 *
 * Note: The length of path between two nodes is represented by the number of edges between them.
 */
public class DiameterOfBinaryTree {


    private int maxLevel = 0;
    private TreeNode maxTreeNode = null;

    /**
     * longest path among these 3:
     * left & right height
     * left diameter
     * right diameter
     */
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root);
    }

    public int diameter(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int lHeight = height(node.left);
        int rHeight = height(node.right);

        int lDiameter = diameter(node.left);
        int rDiameter = diameter(node.right);

        return Math.max(lHeight + rHeight, Math.max(lDiameter, rDiameter));
    }

    public int height(TreeNode node) {

        if (node == null) {
            return 0;
        }

        return 1 + Math.max(height(node.left), height(node.right));
    }


    private void findDeepestNode(TreeNode node, int level) {

        if (node != null) {

            findDeepestNode(node.left, ++level);

            if (level > maxLevel) {
                maxTreeNode = node;
                maxLevel = level;
            }

            findDeepestNode(node.right, level);

        }

    }

}
