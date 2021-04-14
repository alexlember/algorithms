package ru.lember.leetcode.tree;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

public class Lca2 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        Set<TreeNode> pathP = new LinkedHashSet<>(); // O(N)
        boolean isFound = dfs(root, p, pathP); // O(lgN)

        if (!isFound) {
            return null;
        }

        Set<TreeNode> pathQ = new LinkedHashSet<>();
        isFound = dfs(root, q, pathQ); // O(lgN)

        if (!isFound) {
            return null;
        }

        TreeNode prev = null;

        for (TreeNode i : pathP) { // O(N)

            if (!pathQ.contains(i)) {
                return prev;
            }

            prev = i;
        }

        return prev;
    }

    private boolean dfs(TreeNode node, TreeNode p, Set<TreeNode> stack) {
        if (node == null) {
            return false;
        }

        stack.add(node);

        if (node.val == p.val) {
            return true;
        } else if (node.val > p.val) {
            boolean pathOnTheLeft = dfs(node.left, p, stack);
            if (pathOnTheLeft) {
                return true;
            }
            stack.remove(node);
            return false;
        } else {
            boolean pathOnTheRight = dfs(node.right, p, stack);
            if (pathOnTheRight) {
                return true;
            }
            stack.remove(node);
            return false;
        }
    }

}
