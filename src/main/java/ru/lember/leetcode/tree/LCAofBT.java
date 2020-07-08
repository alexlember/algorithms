package ru.lember.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 * <p>
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 * <p>
 * Given the following binary tree:  root = [3,5,1,6,2,0,8,null,null,7,4]
 * <p>
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * Output: 3
 * Explanation: The LCA of nodes 5 and 1 is 3.
 * Example 2:
 * <p>
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
 * Output: 5
 * Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
 * <p>
 * <p>
 * Note:
 * <p>
 * All of the nodes' values will be unique.
 * p and q are different and both values will exist in the binary tree.
 */
public class LCAofBT {


    public static void main(String... args) {

    }

    TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> pathToP = new ArrayList<>();
        if (!hasPath(pathToP, root, p)) {
            throw new IllegalStateException("no path to p found");
        }

        List<TreeNode> pathToQ = new ArrayList<>();
        if (!hasPath(pathToQ, root, q)) {
            throw new IllegalStateException("no path to q found");
        }

        int i = 0;
        TreeNode lca = root;
        boolean isFound = false;
        while (!isFound && i < pathToP.size() && i < pathToQ.size()) {
            TreeNode fromP = pathToP.get(i);
            TreeNode fromQ = pathToQ.get(i);

            if (fromP.val == fromQ.val) {
                lca = fromP;
            } else {
                isFound = true;
            }

            i++;
        }


        return lca;
    }


    private boolean hasPath(List<TreeNode> pathToX, TreeNode root, TreeNode x) {

        if (root == null) {
            return false;
        }

        pathToX.add(root);

        if (root.val == x.val) {
            return true;
        }

        if (hasPath(pathToX, root.left, x) || hasPath(pathToX, root.right, x)) {
            return true;
        }

        pathToX.remove(pathToX.size() - 1); // if not presented - delete this node.
        return false;
    }

    TreeNode lowestCommonAncestorRecursive(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestorRecursive(root.left, p, q);
        TreeNode right = lowestCommonAncestorRecursive(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return left != null ? left : right;
    }

}


